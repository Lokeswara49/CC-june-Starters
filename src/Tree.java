import java.util.Arrays;
import java.util.Scanner;

public class Tree {
    static int N,t;
    static int[] distance;
    static boolean[] visited_vertex;
    static int[] parent;
    static boolean first_flag;
    static boolean last_vertex;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N = sc.nextInt();
        int m= sc.nextInt();
        t= sc.nextInt();
        int c= sc.nextInt();
        distance =new int[N +1];
        visited_vertex =new boolean[1+ N];
        int[][] matrix=new int[N +1][N +1];
        parent =new int[N +1];
        for(int i=0;i<m;i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            matrix[n1][n2] = c;
            matrix[n2][n1]=c;
        }
        for(int i = 1; i<= N; i++){
            if(i== N)
                last_vertex =true;
            Arrays.fill(visited_vertex,false);
            Arrays.fill(distance,Integer.MAX_VALUE);
            distance[1]=0;
            first_flag =false;
            dijkstra(matrix,1,i);
            int n1= distance[i];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[i]=n1;
            Arrays.fill(visited_vertex,false);
            int j=i;
            while(j!=-1 && parent[j]!=0){
                visited_vertex[j]=true;
                j= parent[j];
            }
            visited_vertex[i]=false;
            first_flag =true;
            dijkstra(matrix, i, N);
            int n2 = distance[N];
            if(n2==Integer.MAX_VALUE)
                System.out.println("-1");
            else
                System.out.println(n2);
            Arrays.fill(parent,0);
        }
    }
    static int minimum() {
        int min_value = Integer.MAX_VALUE;
        int index = -1;
        for (int v = 1; v <=N; v++)
            if (!visited_vertex[v] && distance[v] < min_value) {
                min_value = distance[v];
                index = v;
            }

        return index;
    }
    static void dijkstra(int[][] matrix, int source,int destination)
    {
        parent[source]=-1;
              if(source==destination)
                return;
        for (int i = 1; i < N; i++) {
            int n = minimum();
            if (n >= 1 && n <= N){
                visited_vertex[n] = true;
                if (visited_vertex[destination]) {
                    return;
                }
                for (int j = 1; j <= N; j++) {
                    int value= distance[n];
                    int quo=value/t;
                    int wating=0;
                    if(quo%2==1){
                        wating=t-(value%t);
                    }
                    if ((last_vertex || first_flag || j!= N)&&!visited_vertex[j] && matrix[n][j] != 0 && distance[n] != Integer.MAX_VALUE && distance[n] + matrix[n][j] + wating < distance[j]) {
                        distance[j] = distance[n] + matrix[n][j] + wating;
                        parent[j]=n;
                    }
                }
            }
        }
    }
}
