package RotatedSortedArray;

import java.util.Scanner;

public class Main {

    public static int find(int[] nums , int target){
        int lo=0;
        int hi= nums.length -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[lo] <= nums[mid]){
                //lo to mid part is sorted
                if(target >= nums[lo] && nums[mid] >= target){
                    hi = mid -1;
                }else{
                    lo = mid+1;
                }
            }
            else if (nums[mid] <= nums[hi]){
                //mid to hi part is sorted
                if(target >= nums[mid] && nums[hi] <= target ){
                    lo = mid+1;
                }else{
                    hi =mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i =0; i< n ; i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int ans = find(arr,target);
        System.out.println(ans);
        
    }
}
