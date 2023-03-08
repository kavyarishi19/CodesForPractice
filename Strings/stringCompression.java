package Strings;

public class stringCompression {
    public static String compression1(String str){
        String s = str.charAt(0) + "";

        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr!= prev){
                s+= curr;
            }
        }

        return s;
    }

    public static String compression2(String str){
        String s = str.charAt(0) + "";
        int count =1;

        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count=1;    
                }
                s+= curr;
            }
        }

        if(count>1){
            s+= count;
            count =1;
        }
        
    }
}


class solution{
    public int compress(char[] chars){

        int ans=0, i=0;
        while(i < chars.length){
            char curr = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == curr){
                i++;
                count++;
            }
            chars[ans++] = curr;
            if(count != 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}