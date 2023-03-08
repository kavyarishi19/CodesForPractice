import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOcc {
    
    public static boolean isAnagram(Map<Character,Integer> word1CharCount , Map<Character, Integer> word2CharCount){
        for(char c: word1CharCount.keySet()){
            if(word1CharCount.get(c) != word2CharCount.get(c)){
                return false;
            }
        }
        return true;
    }

    private static int countOccurenceOfAnagram(String text, String word){
        int n = text.length();
        int k = word.length();
        int count = 0;

        // Calculate the count of each character for the given word
        Map<Character,Integer> wordCharCount = new HashMap<>();
        for(int i =0 ;i<k;i++){
            char c = word.charAt(i);
            wordCharCount.put(c, wordCharCount.getOrDefault(c, 0)+1);
        }

        // Stores the character count for the current substring 
        Map<Character,Integer> substrCharCount = new HashMap<>();
        int windowStart =0;
        for(int windowEnd = 0; windowEnd < n;windowEnd++){
            char c = text.charAt(windowEnd);
            substrCharCount.put(c, substrCharCount.getOrDefault(c, 0)+1);

            if(windowEnd - windowStart + 1 == k){ // We have hit the window size. Calculate result and slide the window
                if(isAnagram(wordCharCount, substrCharCount)){
                    count++;
                }

                // reduce count for the char at windowStart since we are sliding the window now
                substrCharCount.put(text.charAt(windowStart), substrCharCount.get(text.charAt(windowStart)) - 1);
                windowStart++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.next();
        String word = scn.next();

    }

}
