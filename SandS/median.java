package SandS;

import java.util.Scanner;

public class median {
    
    public static double find(int[] a1 , int[] a2){
        int len = a1.length + a2.length;
        int[] merged = new int[len];

        int i =0;
        int j =0;
        int k =0;

        while(i < a1.length && j< a2.length){
            if(a1[i] < a2[j]){
                merged[k] = a1[i];
                i++;
                k++;
            }
            else{
                merged[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i<a1.length){
            merged[k] = a1[i];
            i++;
            k++;
        }
        while(j<a2.length){
            merged[k] = a2[j];
            j++;
            k++;
        }
        
        if(merged.length % )
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


    }
}
