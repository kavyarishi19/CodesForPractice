public class parity {
    public int[] sortArrayByParity(int[] nums){
        int pointerOne = 0;
        int pointerTwo = nums.length -1;

        while(pointerOne < pointerTwo){
            if(nums[pointerOne]%2 !=0 && nums[pointerTwo]% 2== 0){
                int tmp = nums[pointerOne];
                nums[pointerOne] = nums[pointerTwo];
                nums[pointerTwo] = tmp;
                pointerOne ++;
                pointerTwo --;
            }else if(nums[pointerOne] % 2 != 0 && nums[pointerTwo] %2 != 0){
                pointerTwo --;
            }else if(nums[pointerOne] % 2 == 0 && nums[pointerTwo] %2 !=0){
                pointerOne++;
                pointerTwo--;
            }else{
                pointerOne--;
            }

          
        }
        return nums;
    }
    
    static void swap(int m, int n)
    {
        // Logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        

        
    }
}
