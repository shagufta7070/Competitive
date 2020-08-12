import java.util.*;
import java.lang.*;
import java.io.*;

class twinpair {
	public static void main (String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t>0) { 
		    int n=obj.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)  {
		    a[i]=obj.nextInt();
		        
		    }
 HashMap<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<n;i++) {
    if(hm.containsKey(a[i])) {
        hm.put(a[i],hm.get(a[i])+1);
        
    } else
    hm.put(a[i],1);
    
}
int res=0;
for(Map.Entry entry:hm.entrySet())
{
if(((int)entry.getValue())%2==0)
{
res+=(int)entry.getValue();
}
else
res+=(int)entry.getValue()-1;

}
System.out.println(res);


t--;
		    }
		}
	}
