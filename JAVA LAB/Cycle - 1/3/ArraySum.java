import java.util.Scanner;
class ArraySum{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n;
      System.out.println("Enter no. of elements you want in array:");
      n = scanner.nextInt();
      int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<n; i++)
      {
    	  array[i] = scanner.nextInt();
          sum += array[i];
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}
