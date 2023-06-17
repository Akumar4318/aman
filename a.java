import java.util.*;
import java.io.*;


public class a {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
        int factorial= 1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
System.out.println(factorial);
    }
}