import java.util.*;
import java.lang.*;
import java.io.*;

class sumofdigitN {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t!=0)
{
int x=sc.nextInt();
int n=x;
String s="";
while(x>=10)
{
s=s+9;
x=x-9;
}
s=s+x;
String s1="";
for(int i=s.length()-1;i>=0;i--)
{
s1=s1+s.charAt(i);
}
for(int i=0;i<n;i++) {
	s1=s1+0; }
	System.out.println(s1);
	t=t-1;
	} }}

