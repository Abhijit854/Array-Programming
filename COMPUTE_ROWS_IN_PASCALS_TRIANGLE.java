package Array;

import java.util.*;

public class COMPUTE_ROWS_IN_PASCALS_TRIANGLE {
	public static List<List<Integer>>generatePascalTriangle(int numRows) {
		List<List<Integer>> pascalTriangle = new ArrayList<>();
		for (int i = 0; i < numRows; ++i) {
			List<Integer> currRow = new ArrayList<>();
		    for (int j = 0; j <= i ; ++j){
		    	// Set this entry to the sum of the two above adjacent entries if they
		        // exist.
		        currRow.add((0<j && j < i)? pascalTriangle.get(i - 1).get(j - 1)+ pascalTriangle.get(i - 1).get(j): 1);
		    }
		    pascalTriangle.add(currRow);
		}
		return pascalTriangle ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int n=sc.nextInt();
		List<List<Integer>> p=generatePascalTriangle(n);
		System.out.println("Pascal triangle:"); 
		for(int i=0;i<n;i++)
		{
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			System.out.println(p.get(i));
		}
	}
}
