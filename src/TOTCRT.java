import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class TOTCRT {
    public static void main(String[] args) {
        try{
            Scanner sc= new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0) {
                int n = sc.nextInt();
                HashMap<String, Integer> hm = new HashMap<>();
                int x = 3;
                while (x-- > 0) {
                    String s1 = sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        String s = sc.next();
                        int val = sc.nextInt();
                        if (hm.containsKey(s)) {
                            hm.replace(s, hm.get(s) + val);
                        } else {
                            hm.put(s, val);
                        }
                    }
                }

                int[] arr=new int[hm.size()];
                final int[] index = {0};
                hm.forEach((k,v) -> arr[index[0]++]=v);
                Arrays.sort(arr);
                for(int i=0;i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println("");
            }
        }
        catch (Exception e){
            return;
        }
    }
}
