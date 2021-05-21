import java.util.Scanner;

public class FindSubArraysOfArray {
	static void printArray(int[] input, int start, int end) {
		for(int i=start; i<=end; i++)
			System.out.print(input[i]);
		System.out.println();
	}

	static void printFindSubArrays(int[] input, int size,int m) {
		for(int start=0; start<size; start++) {
			for(int end=start; end<size; end++) {
				if(end-start+1 == m)
				printArray(input, start, end);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size od the array");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		int n= sc.nextInt();
		int[] array= new int[n];
		for(int i=0; i<n ;i++) {
			array[i] = sc.nextInt();
		}
		printFindSubArrays(array,n,2);
	}
	
			
}
