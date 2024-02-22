import java.util.Scanner;

public class CYCLICQD {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int A= sc.nextInt();
                int B= sc.nextInt();
                int C=sc.nextInt();
                int D=sc.nextInt();
                if(A+C==180 && B+D==180)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
        catch (Exception e){
            return;
        }
    }
}
