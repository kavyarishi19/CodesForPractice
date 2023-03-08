import java.util.Scanner;

public class lis {
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<scn.nextInt() ; i++){
            arr[i] = scn.nextInt();
        }

        Integer[] dp = new Integer[n];
        dp[0]= 1;

        for(int i =1; i< dp.length; i++){
            
        }
    }
}
