import java.io.*;
import java.util.*;

public class count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()>0) {
        String k[]=s.split("[!,?._'@\\s]+");
        System.out.println(k.length);
        for(int i=0;i<k.length;i++)
        System.out.println(k[i]);
        scan.close();
        }
    }
}

