import java.util.*;
class counttriplets {
	public static void main(String ar[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int c=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
	Arrays.sort(a);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]==a[k])
						c++;
				}
		 }
		}
		
		System.out.println(c);
		
	}
}