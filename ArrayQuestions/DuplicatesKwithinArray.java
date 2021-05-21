import java.util.Arrays;

public class DuplicatesKwithinArray {

	static int[] duplicateZeros(int []arr)
	{
	      
	    int N = arr.length;
	      
	    // Find the count of
	    // total number of zeros
	    int cnt = count(arr, 0);
	      
	    // Variable to store index 
	    // where elements will be 
	    // written in the final array
	    int write_idx = N + cnt - 1;
	      
	    // Variable to point the current index
	    int curr = N - 1;
	      System.out.println("cnt: "+cnt+"write_idx "+write_idx+"curr :"+ curr);
	    while (curr >= 0 && write_idx >= 0)
	    {
	          
	        // Keep the current element 
	        // to its correctposition, if 
	        // that is within teh size N
	        if (write_idx < N)
	            arr[write_idx] = arr[curr];
	      
	        write_idx -= 1;
	      
	        // Check if the current element is also
	        // zero then again write its duplicate
	        if (arr[curr] == 0)
	        {
	            if (write_idx < N)
	                arr[write_idx] = 0;
	                  
	            write_idx -= 1;
	        }
	        --curr;
	        System.out.println("curr: "+curr+" write_index "+write_idx);
	    }
	      
	    // Return the final result
	    return arr;
	}
	  
	static int count(int []arr, int num)
	{
	    int ans = 0;
	    for(int i : arr)
	      
	       if(i == num)
	          ans++;
	    return ans;
	}
	  
	public static void main(String[] args)
	{
	    int []arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
	    System.out.println(Arrays.toString(arr));
	    int []ans = duplicateZeros(arr);
	  System.out.println(Arrays.toString(arr));
	}
}
