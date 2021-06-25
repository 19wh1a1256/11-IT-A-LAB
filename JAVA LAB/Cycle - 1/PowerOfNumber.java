import java.util.Scanner;
public class PowerOfNumber {
   public static void main(String args[]){
      int power=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the base number :");
      int base = sc.nextInt();
      int temp = base;
      System.out.println("Enter the exponent number :");
      int exp = sc.nextInt();

      for (int i=1; i<=exp; i++){
         power = power*base;
      }
      System.out.println("Result of "+base+" power "+exp+" is "+power);
   }
}
