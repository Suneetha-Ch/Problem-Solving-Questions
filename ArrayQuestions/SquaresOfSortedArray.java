import java.util.Arrays;
import java.util.Scanner;


// Time complexity O(n)
public class SquaresOfSortedArray {
	public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i,j,k,in;
        for(k=0 ; k<n ; k++){
            if(nums[k]>= 0)
                break;
        }
        int[] temp= new int[n];
        i=k-1;
        j=k;
        in=0;
        int negativeSqaure=0, positiveSqaure=0;
        
        while (i>=0 && j < n){
            negativeSqaure= nums[i] * nums[i];
            positiveSqaure = nums[j] * nums[j];
            if (positiveSqaure < negativeSqaure){
                temp[in] = positiveSqaure;
                j++;
            }
            else{
                 temp[in] = negativeSqaure;
                 i--;
            }
            in++;
        }
        while(i>=0){
             negativeSqaure= nums[i] * nums[i];
             temp[in] = negativeSqaure;
                 i--;
            in++;
        }
        while(j<n){
             positiveSqaure = nums[j] * nums[j];
             temp[in] = positiveSqaure;
                j++;
            in++;
        }
    return temp;
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
		System.out.println("Sorted Array :"+ Arrays.toString(sortedSquares(array)));
	}
}
