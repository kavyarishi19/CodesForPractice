public class sortedSquares {
    public int[] sortedSquares(int[] nums){
        int i =0;
        int j = nums.length -1;
        int k = nums.length -1;

        int[] ans = new int[nums.length];
        while(i<=j){
            int v1 =nums[i];
            int v2 =nums[j];
            int sq1 = v1*v1;
            int sq2 = v2*v2;
            if(sq1 < sq2){
                ans[k--] = sq2;
                j--;
            }
            else{
                ans[k--] = sq1;
                i++;
            }
        }
        return ans;
    }
}
