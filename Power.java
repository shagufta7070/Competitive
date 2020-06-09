import java.util.*;
class Power {
public static void main(String ar[]) {
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
Power p=new Power();
System.out.println(p.isPowerOfTwo(n));
}
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<100;i++) {
            double t=Math.pow(2,i);
            if(t==n) {
                return true;
            }
    }
        return false;
}
}