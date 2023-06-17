import java.util.*;
import java.io.*;


public class array1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long factorial= 1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
System.out.println(factorial);
    }
}