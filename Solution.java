import java.util.*;
class Solution {

public static void main(String ar[]) {
Scanner obj=new Scanner(System.in);
String s=obj.next();
String t=obj.next();
Solution st=new Solution();
System.out.println(st.h(s,t));

}
        public static boolean h(String s, String t){
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            // If char found move to next char
            if(s.charAt(j) == t.charAt(i)){
                ++j;
            }
            // Equal means all the characters of t are
            // found in s in order
            if(j == s.length()){
                return true;
            }
        }
        return false;
    }

}
