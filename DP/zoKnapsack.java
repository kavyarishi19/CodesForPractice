import java.util.Scanner;

public class zoKnapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for(int i =0; i<vals.length; i++){
            vals[i] = scn.nextInt();
        }

        for(int i=0; i<wts.length ; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        
    }
}
