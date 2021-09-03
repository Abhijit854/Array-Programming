package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compute_the_next_Permutation {
	public static List<Integer> nextPermutation(List<Integer> perm) {
		int k = perm.size() - 2;
		while (k >= 0 && perm.get(k) >= perm.get(k + 1)) {
			--k;
		}
		if (k == -1) {
			return Collections.emptyList(); // perm is the last permutation.
		}
		// Swap the smallest entry after index k that is greater than perm[k] . We
		// exploit the fact that perm .subList (k + 1, perm.sizeO) is decreasing so
		// if we search in reverse order, the first entry that is greater than
		// perm[k ] is the smallest such entry.
		for (int i = perm.size() - 1; i > k; --i) {
			if (perm.get(i) > perm.get(k)) {
				Collections.swap(perm, k, i);
				break ;
		    }
		}
		// Since perm . subList[k + 1, perm.size()) is in decreasing order, we can
		// build the smallest dictionary ordering of this subarray by reversing it.
		Collections . reverse (perm . subList (k + 1, perm . size ())) ;
		return perm;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(0);
		A.add(3);
		System.out.println("The 1st permutate ArrayList is : "+A);
		List<Integer> B=nextPermutation(A);
		System.out.println("The next permutation is : "+B);
		byte a = 0b0000_0001;
		System.out.println(~(0b0000_0001));
		System.out.println(0b0000_1000);
	}

}
