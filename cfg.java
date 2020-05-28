import java.util.*;
class cfg {
	public static void main (String[] args) {
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
	String a;

	int l;
    while(t!=0) {
        a=obj.next();
        
        String s[]=a.split(",");
        l=s.length;
        for(int i=l-1;i>=0;i--) {
            System.out.print(s[i]+".");
        }
        System.out.println();
        t--;
    }
	}
}