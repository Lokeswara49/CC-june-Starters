import java.util.Scanner;

public class BLITZ {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int n= sc.nextInt();
                int A= sc.nextInt();
                int B=sc.nextInt();
                int n1=n/2, n2=n/2;
                if(n%2!=0){
                    n1++;
                }
                long ans=0;
                ans+=(180-A)+(n1*2);
                ans+=(n2*2)+(180-B);
                System.out.println(ans);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
