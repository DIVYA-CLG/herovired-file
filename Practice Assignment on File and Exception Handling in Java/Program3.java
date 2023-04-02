import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program3{

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int p = sc.nextInt();
            int q = sc.nextInt();
        
            int r = p / q;
            System.out.println(r);
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
        } catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
        sc.close();
    }
}