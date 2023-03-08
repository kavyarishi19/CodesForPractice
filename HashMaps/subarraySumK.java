import java.util.HashMap;

public class subarraySumK{
    public static int solution(int[] arr , int target){
        int ans =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for(int i =0; i< arr.length;i++){
            sum += arr[i];
            int rsum = sum -target;
            if(map.containsKey(rsum)){
                ans += map.get(rsum);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ans;
    }
}