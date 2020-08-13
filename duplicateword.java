import java.util.*;
public class duplicateword {
    public static void main(String ar[]) {
		String s="i love you baby you are mine";
		String[] str=s.split(" ");
		LinkedList<String> l=new LinkedList<>(); 
		for(int i=0;i<str.length;i++) {
			if(l.contains(str[i]))
				continue;
			else
				l.add(str[i]);
		}
		String st="";
		for(int i=0;i<l.size();i++) {
			st=st+l.get(i)+" ";
		}
		System.out.println(st);
}}