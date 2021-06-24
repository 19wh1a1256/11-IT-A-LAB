public class ThrowBlock
{  
   static void eligible(int age)
   {  
     if(age<18)  
      throw new ArithmeticException("not eligible");  
     else  
      System.out.println("eligible");  
   }  
   public static void main(String args[])
   {  
      eligible(43);  
      System.out.println("--Flow--");  
  }  
}  
