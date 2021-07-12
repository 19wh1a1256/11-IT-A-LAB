import java.util.Scanner;
public class BubbleSortExample {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int size, count = 0;
		System.out.print("Enter the list size: ");
		size = read.nextInt();
		int list[] = new int[size];
		System.out.println("Enter any " + size + " integer numbers: ");
		for(int i = 0; i < size; i++)
			list[i] = read.nextInt(); 
		int temp=0;
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(list[j]<list[j+1]) {
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					count++;
				}
			}	
		}
		System.out.println("List of sorted elements: ");
		for(int x:list) {
			System.out.print(x + "   ");
		}
		System.out.println("\nTotal number of Interchanges is " + count);
	}
}
