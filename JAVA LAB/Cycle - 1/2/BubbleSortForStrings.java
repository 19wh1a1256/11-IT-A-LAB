import java.util.Scanner;
class BubbleSortForStrings {
	public static void main(String []args) {
		int n, c, d;
                String swap;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of strings to sort");
		n = in.nextInt();
		String array[] = new String[n];
		System.out.println("Enter " + n + " strings");
		for (c = 0; c < n; c++) 
		      array[c] = in.next();
		for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d+1].compareTo(array[d]) < 0) 
			        {
					swap       = array[d];
					array[d]   = array[d+1];
					array[d+1] = swap;
				}
			}
		}
		System.out.println("Sorted list of strings");
		for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	}
}
