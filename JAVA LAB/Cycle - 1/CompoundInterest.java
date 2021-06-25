import java.util.*;
public class CompoundInterest
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();   
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=sc.nextFloat();      
        sc.close();
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}
