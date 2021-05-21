import java.util.Arrays;
import java.util.Scanner;

public class CheckeIsArraySorted {
	
	static  boolean isArraySorted(int[] input, int low, int high) {
		
		if(low==high)
			return true;
		
		if (high == (low+1))
		{
			return (input[low] < input[high]);
		}
		else 
		{
			int mid=(low+high)/2;
			if( isArraySorted(input, low, mid) ) {
				return isArraySorted(input, mid+1, high);
			}
		}	
		return false;
	}
	public static void main(String args[]) {
		
		int n;
		System.out.println("Enter Array size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("is Array sorted ?:"+ isArraySorted(array, 0 , array.length-1));
	}

}
