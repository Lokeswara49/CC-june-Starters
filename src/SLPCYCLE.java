import java.util.Arrays;
import java.util.Scanner;

public class SLPCYCLE {

    public static void main(String[] args) {


        try{

            Scanner sc=new Scanner(System.in);

            int t= sc.nextInt();
            while (t-->0){
                int L= sc.nextInt();
                int H=sc.nextInt();
                String s1= sc.nextLine();
                String s= sc.nextLine();
                int val=0;
                boolean flag=false;
                int[] count = new int[H+1];
                Arrays.fill(count,0);
                for(int i=0;i<L;i++){
                    if(s.charAt(i)=='0'){
                        val++;
                    }
                    else{
                        if(val>=H){
                            count[H]=1;
                            flag=true;
                            break;
                        }
                        else{
                            count[val]=1;
                        }
                        val=0;
                    }
                }
                if(val>=H){
                    count[H]=1;
                    flag=true;
                }
                else{
                    count[val]=1;
                }
                for(int i=H;i>=0;i--){
                    if(count[i]==1){
                        if(i>=H) {
                            flag = true;
                            break;
                        }
                        else{
                            H=(H-i)*2;
                        }
                    }
                }
                if(flag)
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
