import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxAllSubarr {
    
    public static int[] maxofAllSubarray(int[] a, int k){
        int n = a.length;
        int[] maxOfSubarrays = new int[n-k+1];
        int idx=0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int windowStart = 0;
        for(int windowEnd = 0 ; windowEnd < n ; windowEnd++){
            q.add(a[windowEnd]);

            if(windowEnd-windowStart +1 == k){ // we have hit the window size . Find the maximum in the current window and slide the window ahead
                int maxElement = q.peek();
                maxOfSubarrays[idx++] = maxElement;

                if(maxElement == a[windowStart]){ // 
                    q.remove();
                }

                windowStart++;
    
            }
        }

        return maxOfSubarrays;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        
    }
}
