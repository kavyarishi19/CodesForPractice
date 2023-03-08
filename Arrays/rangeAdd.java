import java.util.Scanner;

public class rangeAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int length = scn.nextInt();

        int nq = scn.nextInt();

        int[][] queries = new int[nq][3];


    }

    public static int[] getModifiedArray(int length , int[][] queries){
        int[] res = new int[length];

        for(int q= 0; q< queries.length; q++){
            int st = queries[q][0];
            int end = queries[q][1];
            int inc = queries[q][2];

            res[st] += inc;
            if(end+1 < length){
                res[end+1] -= inc;
            }
        }

        int sum =0;

        for(int i =0; i< length ; i++){
            sum += res[i];
            res[i] = sum;
        }

        return res;
        
    }
}
