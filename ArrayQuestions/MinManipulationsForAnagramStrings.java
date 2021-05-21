import java.util.Arrays;
import java.util.Scanner;

public class MinManipulationsForAnagramStrings {
	
	public static int countManipulations(String s1, String s2) {
		int count =0;
		int[] char_count = new int[26];
		for(int i=0; i<s1.length(); i++) {
			char_count[s1.charAt(i)-'a']++;
		}
		System.out.println("char_array : "+ Arrays.toString(char_count));
		
		for(int i=0; i <s2.length() ; i++) {
			char_count[s2.charAt(i)-'a']--;
		}
		
		System.out.println("char_array : "+ Arrays.toString(char_count));
		for(int i=0; i<26; i++) {
			if(char_count[i]>0)
			count+= char_count[i];
		}
		return count;
		
	}

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the strings to check for ANagram");
		s1=sc.next();
		s2=sc.next();
		if(s1.length() == s2.length())
			System.out.println("no. of manipulations needed to make given strings as anagram : \n" + countManipulations(s1,s2));
		else
			System.out.println("Given strings are not equal lenght");
	}
}
