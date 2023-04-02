import java.util.Scanner;

    /*
    * Create the method long power(int, int) here.
    
    
    */
  class MyCalculator { long res; int pow;

long power(int n, int p)throws Exception{
    pow=1;
    res=0;
    if(n<0 || p<0)
    {
        throw new Exception("n or p should not be negative.");
    }else if(n==0 && p==0)
    {
        throw new Exception("n and p should not be zero."); 
    }else{
        for(int i=1;i<=p;i++)
        pow=pow*n;
    }
    res=(long)pow;
    return res;
}       
}


public class Program4 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}