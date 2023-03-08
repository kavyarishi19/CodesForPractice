import java.util.ArrayList;
import java.util.Scanner;

public class majorityEle {

    public static ArrayList<Integer> majorityElement2(int[] arr){
        int val1 = arr[0];
        int count1 = 1;

        int val2 = arr[0];
        int count2 = 1;

        int i =1;
        while(i<arr.length){
            if(arr[i] == val1){
                count1++;
            }else if(arr[i] == val2){
                
            }
        }
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityElement2(arr) ;
        System.out.println(res);
    }
}
