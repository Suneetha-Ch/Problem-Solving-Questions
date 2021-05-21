import java.util.Scanner;

// Time complexity O(n)
public class FindMaxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=count;
       
        if(nums.length>0){
            if(nums.length ==1){
                if(nums[0]==1)
                maxCount=1;
            }   
            else{
                for(int x: nums){
                    if(x==1)
                    {count++;
                     if(maxCount<count)
                            maxCount=count;
                    }
                    else{
                       
                        count=0;
                    }
                }
            }
       }
       return maxCount;
        
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
		int maxConsecutiveOnes = findMaxConsecutiveOnes(array);
		System.out.println("Max consecutives Ones in given array : "+maxConsecutiveOnes);
		
		
	}

}
