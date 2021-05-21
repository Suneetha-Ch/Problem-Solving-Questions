import java.util.Scanner;

// Time complexity O(n)

public class NumberOfEvenDigitsValuesOfArray {
	public static int isEventDigitNumber(int num){
	    int count=0;
	       while(num>0){
	           num = num/10;
	           count++;
	       }
	        if(count%2==0)
	        	return 1;
	        else
	        	return 0;
	    }
	    
	    public static int findNumbers(int[] nums) {
	        int count=0;
	        for(int x: nums){
	            if(x>10){
	                if(isEventDigitNumber(x)==1)
	                    count++;
	            }
	            else
	                continue;
	        }
	        return count;
	    }
	public static void main(String[] args) {
		int n;
		System.out.println("Enter Array size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("No. of even number digits in the given array :"+ findNumbers(array));
	}


}
