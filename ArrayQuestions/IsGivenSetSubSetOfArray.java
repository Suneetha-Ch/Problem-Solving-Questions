

import java.util.*;

public class IsGivenSetSubSetOfArray {
	
	public static void main(String args[]) {
		System.out.println("Enter the size of the array");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int mainArray[]= new int[n];
		for(int i=0; i<n; i++)
			mainArray[i] =  sc.nextInt();		
	}
}
