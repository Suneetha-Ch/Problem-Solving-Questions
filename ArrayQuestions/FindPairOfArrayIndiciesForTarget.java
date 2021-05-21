import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

 */
public class FindPairOfArrayIndiciesForTarget {
	static int[] findIndicesOfPair(int[] input,int target) {
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0; i< input.length; i++)
			map.put(input[i], i);
		int component=0;
		for(int i=0; i<input.length; i++)
		{
			component= target-input[i];
			if(map.containsKey(component) && map.get(component)!=i )
				return new int[] {i,map.get(component)};
		}
		return new int[] {};
	}
	
	// 2pointer approach if the array is sorted
	static int[] findIndicesPairFromSortedArray(int[] input, int target) {
		
		int left=0, right= input.length-1;
		int total=0;
		
		while (left<right) {
			total= input[left]+ input[right];
			
			if(total==target) {
				return new int[] {left,right};
			}
			if(total>target) {
				right--;
			}
			else if(total<target) {
				left++;
			}
		}
		return new int[] {};
	}
	
	//find closest pair which sum is less than or equal to target in sorted array
	static int[] findClosestPair(int[] input, int target) {
		int diff=10000000;
		int pairOne=0, pairTwo=0;
		int left=0, right= input.length-1;
		int total=0;
		System.out.println(diff);
		if(input.length>1) {
			while(left<right) {		
				total=input[left]+input[right];
				
				if(total==target) {
					return new int[] {left,right};
				}
				if(Math.abs(target-total) <diff)
					{
						diff=(target-total);
						pairOne=left;
						pairTwo=right;
					}
				System.out.println("input[left]: "+input[left]+", input[right]: "+input[right]+", total"+total);
				System.out.println("diff: "+diff+", indices: ("+pairOne+","+pairTwo+")" );
				if(total <target) {
					left++;
				}
				else if(total>target) {
					right--;
				}
				
			}
			return new int[] {pairOne,pairTwo};
		}
		return new int[] {};
			
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int[] input= new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++)
			input[i]=sc.nextInt();
		System.out.println("enter the target number");
		int target=sc.nextInt();
		//if un sorted array go with hashing O(n)
		//int output[]=findIndicesOfPair(input,target);
		
		//if sorted array go with 2 pointer approach O(n)
		//int output[]=findIndicesPairFromSortedArray(input,target);
		
		//if we need to find closest pair whose sum is less than or equal to target in sorted array
		int[] output=findClosestPair(input,target);
		if(output.length>0)
			System.out.println("Indices found @" +Arrays.toString(output));
		else
			System.out.println("No pair found");
		
	}

}
