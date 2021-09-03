package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class COMPUTE_A_RANDOM_PERMUTATION {
	public static List<Integer> computeRandomPermutation(int n) {
		List <Integer> permutation = new ArrayList <>(n) ;
		for (int i = 0; i < n; ++i) {
			permutation . add(i) ;
		}
		Sample_offline_Data . randomsampling (permutation .size () , permutation) ;
		return permutation;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k:");
		int k=sc.nextInt();
		System.out.println("Random permutation is: "+computeRandomPermutation(k));

	}
}
