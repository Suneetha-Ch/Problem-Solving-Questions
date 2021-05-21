import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import javax.annotation.Generated;

public class SubSequencesOfArray {
	
	
	static void printArray(int arr[],int length) {
		/*
		 * System.out.println();
		 * 
		 * for(int i=0; i<length;i++) System.out.print(arr[i]);
		 */
		List<Integer> tempList=new ArrayList<Integer>();
		  for(int i=0;i<length;i++)
			  tempList.add(arr[i]);
		  
		  System.out.println(tempList.toString());
		  System.out.println("--------List");
		 
		 // list.add(tempList);
	}
	
	
	static List<List<Integer>> GenerateSequnces(int[] arr, int current_array_Index,int ssqa[],int curr_sub_sq_index){
		if(current_array_Index==arr.length) {
			
			  List<Integer> tempList=new ArrayList<Integer>();
			  List<List<Integer>> list=new ArrayList<List<Integer>>();
			  for(int i=0;i<curr_sub_sq_index;i++) tempList.add(arr[i]);
			  System.out.println(tempList.toString());
			  list.add(tempList);
			  return list;
			//printArray(ssqa, curr_sub_sq_index);
		}
		else {
			List<List<Integer>> finalList=new ArrayList<List<Integer>>();
			ssqa[curr_sub_sq_index] = arr[current_array_Index];
			
			//include the above assignment & move to next element in Sub Sequence array to assign next element of input array(increment array index too)
			finalList.addAll(GenerateSequnces(arr, current_array_Index+1, ssqa, curr_sub_sq_index+1));
			
			//exclude the assignment ie. overwrite the value at curr_sub_sq_index with next element of array
			finalList.addAll(GenerateSequnces(arr, current_array_Index+1, ssqa, curr_sub_sq_index));
			return finalList;
		}
	}
	
	static void printAllSubSequencesOfArray(int[] arr, int current_array_Index,int ssqa[],int curr_sub_sq_index) {

		List<List<Integer>> finalList=new ArrayList<List<Integer>>();
		finalList=GenerateSequnces(arr,current_array_Index,ssqa,curr_sub_sq_index);

			  System.out.println(finalList.toString());
			// for(Integer temp:tempList)
			// System.out.println(tempList.toString());
		//for(List i:finalList)
			//System.out.println(i.toString());
	//	return finalList;
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
		int[] ssqa=new int[array.length];
		printAllSubSequencesOfArray(array,0,ssqa,0);
		
		
	}
}
