import java.util.LinkedList;
import java.util.Queue;

public class firNeg {

    public static int[] findFirstNegativeNumber(int[] a , int k){
        int n = a.length;
        int[] firstNegative = new int[n-k+1];
        int idx = 0;

        Queue<Integer> q = new LinkedList<>();

        int windowStart =0;
        for(int windowEnd=0;windowEnd<n;windowEnd++){
            if(a[windowEnd] < 0){
                q.add(a[windowEnd]);
            }

            if(windowEnd - windowStart + 1 == k){
                if(q.isEmpty()){
                    firstNegative[idx++] = 0;
                }else{
                    int num = q.peek();
                    firstNegative[idx++] = num;

                    if(num == a[windowStart]){
                        q.remove();
                    }
                }
                windowStart++;
            }
        }
        return firstNegative;
    }
}
