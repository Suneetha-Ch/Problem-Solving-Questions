import java.util.Arrays;

public class ArrayInsertionAtEnd {

	public static void main(String[] args) {
	int[] a=new int[6];
	a[0]=0;
	a[1]=1;
	a[2]=2;
	System.out.println(Arrays.toString(a));
	a[a.length]=10;
	System.out.println(Arrays.toString(a));

	}

}
