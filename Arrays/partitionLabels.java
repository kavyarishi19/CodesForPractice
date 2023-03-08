import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class partitionLabels {
    public static List<Integer> partitionLabels(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        //1. filling of impact of characters
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        //2. Making of result
        List<Integer> res = new ArrayList<>();
        int prev =-1;
        int max =0;

        for(int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch))
            if(max== 1){
                res.add(max - prev);
                prev =  max;
            }
        }

        return res;
    }

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        List<Integer> res = partitionLabels(str);
        for(int val : res){
            System.out.println(val + " ");
        }

    }
}
