import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearchWithArrayDivision {
	static void  search_N_complexity (int array[],int element_to_Search) {
		int found=-1;
		for (int loop_variable=0; loop_variable < array.length; loop_variable++)
		{
			if (array[loop_variable]==element_to_Search)
				{
					System.out.println("Element "+element_to_Search+" found at "+loop_variable );
					found=1;
					break;
				}
		}
		if(found==-1) {
			System.out.println("Element"+element_to_Search+"Not found");
		}
	}
	
	static void search_HalfN_Complexity(int[] inputArray,int element_to_Search){
		int left=0;
		int right=(inputArray.length-1);
		int index=-1;
		while( left <= right) {
			if(inputArray[left] == element_to_Search) {
				index=left;
				System.out.println(element_to_Search+" found at "+(index+1) +"with Attempt "+(left+1) );
			}
			if(inputArray[right] == element_to_Search) {
			index=right;
			System.out.println(element_to_Search+" found at "+(index+1)+" with Attempt "+ (left-right));
			}
			left++;right--;
		}
		if(index==-1)
		{	System.out.println("Element "+element_to_Search+" not found");
		}
		
	}
	
	public static void main(String args[]) {
		int[] inputArray={ 1, 2, 3, 4, 5 };
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("Enter the element to find");
			int element_to_Search=Integer.parseInt(bf.readLine());
			
			//search_N_complexity(inputArray,element_to_Search);
			search_HalfN_Complexity(inputArray,element_to_Search);
		} 
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
