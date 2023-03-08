import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class validTri {
    public static void main(String[] args) {
        
    }

    public static int countTriangles(int[] arr){
        Arrays.sort(arr);
        int count =0;

        for(int i = arr.length -1 ; i>= 2 ; i--){
            int l =0;
            int r = i-1; 
            while(l<r){
                if(arr[l] + arr[r] > arr[i]){
                    count += r-l;
                    r--;
                }else{
                    l++;
                }
            }
        }

        return count;
    }
}
