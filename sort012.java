import java.util.*;
class sort012 {
	public static void main(String ar[]) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int temp=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		for(int j=0;j<n;j++) {
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
	}
}