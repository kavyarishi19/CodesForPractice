package Easy;

import java.util.Stack;

class printPrevSmaller{
    static void printPrevSmaller(int arr[], int n){
        Stack<Integer> S = new Stack<>();

        //traverse all array elements
        for(int i =0; i<n; i++){
            // Keep removing top elements from S while the top
            //element is greater than or equal to arr[i]
            while(!S.empty() && S.peek() >= arr[i]){
                S.pop();
            }

            //if all elements in S were greater than arr[i]
            if(S.empty()){
                System.out.println("_");
            } else // Else print the nearest smaller element
            {
                System.out.println(S.peek() + ",");
            }

            S.push(arr[i]);
        }
    }
}


