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
            if(s.charAt(j) == t.charAt(i)){
                ++j;
            }
            
            if(j == s.length()){
                return true;
            }
        }
        return false;
    }

}