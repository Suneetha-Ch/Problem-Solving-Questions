public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

    int[][] matrix = { { 10, 20, 30, 40 },
                       { 12, 22, 35, 45 },
                       { 14, 24, 44, 47 },
                       { 16, 25, 4650 }
                      };
    int i=0,j=3;
    int key=43;
    while( i<3&& j>=0){
        if(key > matrix[i][j])
            i++;
        else if( key < matrix[i][j])
            j--;
        else if ( key==matrix[i][j])
          {  System.out.println("found"+i+","+j);return;}
    }
     System.out.println("not found");
     // System.out.println("Sum of x+y = " + z);
    }
}
//https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
//I/P:
/* { { 10, 20, 30, 40 },
                       { 12, 22, 35, 45 },
                       { 14, 24, 44, 47 },
                       { 16, 25, 4650 }
                      };*/
//T.C: O(n)
