import java.util.Scanner;

public class minSizeSub {

    public static int findLengthOfSmallestSubarray(int[] a , int k){
        int n = a.length;

        int lengthOfSmallestSubarray = Integer.MAX_VALUE;

        int windowSum =0;

        int windowStart = 0;
        for(int windowEnd =0;windowEnd < n;windowEnd++){
            windowSum += a[windowEnd]; // Add the next element to the window

            while(windowSum >=k){
                lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray, windowEnd-windowStart+1);
                windowSum -= a[windowStart]; // Discard the element at 'windowStart' since it is going out of the window
                windowStart++;
            }
        }

        return lengthOfSmallestSubarray == Integer.MAX_VALUE ? 0 : lengthOfSmallestSubarray;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] a = new int[n];
        for(int i =0;i< n ; i++){
            a[i] = scn.nextInt();
        }

        int k = scn.nextInt();
    }
}
