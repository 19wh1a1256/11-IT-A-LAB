import java.util.Scanner;
public class EvenOrOdd {
   public static void main(String args[]){
      //Reading number from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::" );
      int num = sc.nextInt();
     
      //Finding even or odd
      if (num % 2 == 0){
         System.out.println("Entered number is an even number");
      } else {
         System.out.println("Entered number is an odd number");
      }
   }
}
