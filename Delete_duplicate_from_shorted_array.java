package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Delete_duplicate_from_shorted_array {
	public static int deleteDuplicates(List<Integer> A) {
		if (A.isEmpty()) {
			return 0;
			}
		int writelndex = 1;
		for (int i = 1; i < A.size(); ++i) {
			if (!A .get(writelndex - 1).equals(A.get(i))) {
				A.set(writelndex++, A.get(i));	
			}
		}
		return writelndex;
	}
	public static void delete(List<Integer> A) {
		for(int i=0;i<A.size();i++)
		{
			for(int j=i+1;j<A.size();j++)
			{
				while(A.get(i).equals(A.get(j)))
				{
					A.set(j, 0);
				    break;
			    }
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(5);
		a.add(7);
		a.add(11);
		a.add(11);
		a.add(11);
		a.add(13);
		Collections.sort(a);
		System.out.println("The Array is :\n"+a);
		System.out.println("Output: " + deleteDuplicates(a));
		int K=deleteDuplicates(a);
		System.out.println("No. of  element : "+K);
		delete(a);
		System.out.println("After Deleting the duplicates : \n"+a);
		

	}

}
