import java.util.Scanner;

public class missPositive {

    public static int firstMissingPositive(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int a = arr[i];
            if(a>=1 && a<=n){
                if(arr[a-1]!=a){
                    arr[i] = arr[a-1];
                    arr[a-1] = a;
                }else{
                    i++;
                }   
            }else{
                i++;
            }


        }

        for(int j=0; j<n ;j++){
            if(arr[j]!= j+1) return j+1;
        }
        return n+1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i =0 ;i<n; i++){
            arr[i] = scn.nextInt();
        }

        int res = firstMissingPositive(arr);
        System.out.print(res);
    }
}
