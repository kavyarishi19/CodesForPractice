import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class minDominoRotations {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        HashMap<Integer,Integer> z = new HashMap<>();
        
        z.put(tops[0],1);
        z.put(bottoms[0], 1);
        for(int i =1 ;i<tops.length ;i++ ){
            if(tops[i] == tops[0] || bottoms[i] == tops[0]){
                z.put(tops[0] , z.get(tops[0])+1);
            }

            if(tops[i] == bottoms[0] || bottoms[i] == bottoms[0]){
                z.put(bottoms[0] , z.get(bottoms[0])+1);
            }
        }

        int k = getKey(z,6); 

        boolean result = z.containsValue(6);

        if(result == true){
            
        }
    }

    public static <K, V> K getKey(Map<K, V> map, V value)
{
    for (K key: map.keySet())
    {
        if (value.equals(map.get(key))) {
            return key;
        }
    }
    return null;
}

}







