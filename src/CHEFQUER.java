import java.util.Scanner;

public class CHEFQUER {

    public static void main(String[] args) {


        try {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int Q= sc.nextInt();
            long[] a=new long[N+1];
            a[0]=0;
            for(int i=1;i<=N;i++){
                a[i] = sc.nextInt();
            }
            // long[] value = new long[1200001];
            // for(int i=0;i<value.length;i++){
            //     value[i]=(long)(Math.pow(i,2));
            // }
            int x=Q;
            int maxL=0,maxX=0;
            int[][] arr=new int[Q][];
            int i=0;
            while(x-->0){
                int val=sc.nextInt();
                if(val==1){
                    arr[i]=new int[4];
                    arr[i][0]=val;
                    arr[i][1]=sc.nextInt();
                    Math.max(arr[i][1],maxL);
                    arr[i][2]=sc.nextInt();
                    arr[i][3]=sc.nextInt();
                    Math.max(maxX,arr[i][3]);
                }
                else{
                    arr[i]=new int[2];
                    arr[i][0]=val;
                    arr[i][1]=sc.nextInt();
                }
                i++;
            }
            long[] value = new long[N+maxX+maxL];
            for(int j=0;j<value.length;j++){
                value[j]=(long)(Math.pow(i,2));
            }
            int j=0;
            while (Q-- > 0) {
                int val= arr[j][0];
                if(val==1){
                    int L=arr[j][1];
                    int R= arr[j][2];
                    int X= arr[j][3];
                    for(int k=L;k<=R;k++){
                        int temp=X+k-L;
                        if(temp<0){
                            temp=-temp;
                        }
                        a[k]+=value[temp];

                    }

                }
                else{
                    int k=arr[j][1];
                    System.out.println(a[k]);

                }
                j++;
            }
        }
        catch (Exception e){
            return;
        }
    }
}
