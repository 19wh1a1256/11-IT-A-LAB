public class ReverseWordsInString
{
   public void reverseWordInMyString(String str)
   {
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	ReverseWordsInString obj = new ReverseWordsInString();
	obj.reverseWordInMyString("Hello Welcome to java programming");
   }
}
