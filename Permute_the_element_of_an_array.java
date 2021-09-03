package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute_the_element_of_an_array {
	public static void applyPermutation(List<Integer> perm, List<Character> A){
		for (int i = 0; i < A.size(); ++i){
			// Check if the element at index i has not been moved by checking if
			// perm. get (i) is nonnegative .
		    int next = i;
		    while (perm.get(next) >= 0){
		    	Collections.swap(A , i, perm.get(next));
		        int temp = perm.get(next);
		        // Subtracts perm.sizeO from an entry in perm to make it negative ,
		        // which indicates the corresponding move has been performed .
		        perm.set(next , perm.get(next) - perm.size());
		        next = temp;
		    }
		 }
		// Restore perm.
		for (int i = 0; i < perm.size(); i++) {
			perm.set(i, perm.get(i) + perm.size());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p=new ArrayList<Integer>();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(0);
		System.out.println("The 1st ArrayList is :\n"+p);
		List<Character> a=new ArrayList<Character>();
		a.add('A');
		a.add('B');
		a.add('C');
		a.add('D');
		System.out.println("The 2nd ArrayList is :\n"+a);
		applyPermutation(p,a);
		System.out.println("The final permutation Array is :"+a);
		
		
	}

}
