import java.util.Scanner;

public class climbingStairs{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countPath(n);
        System.out.println(cp);
    }

    public static int countPath(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }

        int nm1 = countPath(n-1);
        int nm2 = countPath(n-2);
        int nm3 = countPath(n-3);

        int cm = nm1+nm2+nm3;

        return cm;
    }

    //Memoization
    public static int countPath(int n , int[] qb){
        if(n==0){
            return 1;
        } else if(n<0){
            return 0;
        }

        if(qb[n] > 0){
            return qb[n];
        }

        int nm1 = countPath(n-1, qb);
        int nm2 = countPath(n-2, qb);
        int nm3 = countPath(n-3, qb);
        int cp = nm1+nm2+nm3;
        qb[n] = cp;
        return cp;
    }

    //Tabulation
    
    public static int countPathTab(int n){
        int[] dp = new int[n+1];

        dp[0] =1;
        for(int i =1; i<=n; i++){
            if(i==1){
                dp[i] = dp[i-1];
            } else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            } else{
                dp[i] = dp[i-1] +dp[i-2] +dp[i-3];
            }
        }

        return dp[n];
    }
}