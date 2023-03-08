import java.util.Scanner;

public class nextGreaterElement{


    public static String nextGreaterElement(String str){
        char[] arr = str.toCharArray();

        // 1. find first dip
        int i = arr.length -2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        } 
        if(i==-1){
            return  "-1";
        }

        // find just greater than ith index element
        int k = arr.length -1;
        while(arr[i] > arr[k]){
            k--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

        //concatenate from 0 to i index

        String res = "";
        for(int j =0 ;j<= i; j++){
            res+= arr[j];
        }

        //concatenate from k to i+1 index
        for(int j =arr.length -1 ; j> i;j--){
            res+= arr[j];
        }

        return res;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();

        String res = nextGreaterElement(num);

        System.out.print(res);
    }
}