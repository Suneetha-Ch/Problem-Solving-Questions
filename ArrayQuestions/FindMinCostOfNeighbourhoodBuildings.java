import java.util.Arrays;
import java.util.Scanner;

public class FindMinCostOfNeighbourhoodBuildings {
/*A construction company is building a new neighbourhood. Each house will be built using one of three main materials [wood,brick,cement], but no side by side houses should be built using the same material. Given an n*3 array where values in column respresents the cost of materials and "n" represents the number of houses , determine the minimum cost to build the neighbourhood.

Example 1:
given input : [[1,2,3],[1,2,3],[3,3,1]] (values in column represent cost of materials)

output : 4

Explanation:
choose material-1 of cost 1 in first house(row)
choose material-2 of cost 2 in second house(row)
choose material-3 of cost 1 in third house (row)
total = 1+2+1 -> 4

Example 2:

input: [[1,10,20],[2,100,200]]

output: 12

Explanation:
choose material-2 of cost 10 in first house(row)
choose material-1 of cost 2 in second house(row)
total = 10 + 2 -> 12*/
	static int minCostOfBuildingNeighbourHood(int[][] cost) {
		int price=0;
		for(int i=1;i<cost.length;i++) {
			cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
			cost[i][1] +=Math.min(cost[i-1][0], cost[i-1][2]);
			cost[i][2] +=Math.min(cost[i-1][0], cost[i-1][1]);
			System.out.println(Arrays.toString(cost[i]));
		}
		price= Math.min(  Math.min(cost[cost.length-1][0], cost[cost.length-1][1 ]), cost[cost.length-1][2]);
		return price;
	}
	
	public static void main(String ar[]) {
		
		System.out.println("enter no.of buildings");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] cost=new int[n][3];
		
		System.out.println("Enter 3 material prices for each buidling");
		
		for(int i=0;i<n ; i++) {
			System.out.println("enter for Building "+(i+1));
			for(int j=0;j<3;j++) {
				cost[i][j]=sc.nextInt();
			}
		}
		System.out.println(minCostOfBuildingNeighbourHood(cost));
		
	}

}
