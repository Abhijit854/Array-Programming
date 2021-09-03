package Array;

import java.util.ArrayList;
import java.util.List;

public class Permute_the_element_of_an_array_2 {
	public static void applyPermutation(List <Integer> perm, List<Integer> A) {
		for (int i = 0; i < A.size(); ++i) {
			// Traverses the cycle to see if i is the minimum element.
			boolean isMin = true;
			int j = perm.get(i);
			while (j != i){
				if (j < i){
					isMin = false;
					break ;
				}
				j = perm. get (j) ;
			}
			if (isMin) {
				cyclicPermutation(i , perm, A);
			}
		}
	}
	private static void cyclicPermutation(int start, List <Integer > perm,List <Integer > A) {
		int i = start;
		int temp = A . get (start) ;
		do {
			int nextI = perm.get(i);
			int nextTemp = A .get(nextI ) ;
			A.set(nextI, temp);
			i = nextI ;
			temp = nextTemp;
		}	
		while (i!=start) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p=new ArrayList<Integer>();
		p.add(2);
		p.add(0);
		p.add(1);
		p.add(3);
		System.out.println("The 1st ArrayList is :\n"+p);
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(30);
		a.add(23);
		a.add(12);
		System.out.println("The 2nd ArrayList is :\n"+a);
		applyPermutation(p,a);
		System.out.println("The final permutation Array is :"+a);
	}

}
