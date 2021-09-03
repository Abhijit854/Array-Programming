package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class COMPUTE_A_RANDOM_SUBSET {
	public static List<Integer> randomSubset(int n, int k) {
		Map<Integer , Integer> changedElements = new HashMap<>();
		Random randldxGen = new Random();
		for (int i = 0; i < k; ++i) {
			int randldx = i + randldxGen.nextInt(n - i);
		    Integer ptrl = changedElements.get(randldx);
		    Integer ptr2 = changedElements.get(i);
		    if (ptrl == null && ptr2 == null) {
		    	changedElements.put(randldx , i);
		        changedElements.put(i, randldx);
		    } 
		    else if (ptrl == null && ptr2 != null) {
		    	changedElements.put(randldx , ptr2);
		    	changedElements.put(i, randldx);
		    } 
		    else if (ptrl != null && ptr2 == null) {
		    	changedElements.put(i , ptrl);
		    	changedElements.put(randldx , i);
		    } 
		    else {
		    	changedElements.put(i , ptrl);
		        changedElements.put(randldx , ptr2);
		    }
		}
		List<Integer> result = new ArrayList<>(k);
		for (int j = 0; j<k; ++j) {
			result.add(changedElements.get(j));
		}
		return result ;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a positive integer n:");
			int n=sc.nextInt();
			System.out.println("Enter the size of size k(k<=n):");
			int k=sc.nextInt();
			System.out.println("Random subset is: "+randomSubset(n,k));
		}
}
