package Easy;

import java.util.HashSet;

public class isProduct {
    static boolean isProduct(int arr[] , int n , int x){
        //create an empty set and insert first
        //element into it

        HashSet<Integer> hset = new HashSet<>();

        if(n<2)
            return false;

        //Traverse remaining elements
        for(int i=0; i<n ; i++){
            // 0 case must be handled explicitly as
            // x%0 is undefined

            if(arr[i] == 0){
                if(x==0)
                    return true;
                else
                    continue;
            }

            // x/arr[i] exists in hash , then we 
            // found a pair

            if(x%arr[i] == 0){
                if(hset.contains(x/arr[i]))
                    return true;
            hset.add(arr[i]);
            }
        }
        return false;
    }
}
