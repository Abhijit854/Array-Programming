package Array;
import java.util.*;

public class Increment_Integer {
	
	public static List<Integer> plusOne (List<Integer> A) {
		int n = A.size() - 1;
		Integer set = A.set(n, A.get(n) + 1);
		for (int i = n; i > 0 && A.get(i) == 10; --i) {
			A .set (i , 0) ;
		    A.set(i - 1, A.get(i - 1) + 1);
		    }
		if (A .get (0) == 10)
		{
			A .set (0 , 0) ;
		    A . add (0 , 1);
		}
		return A ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(9);
		a.add(9);
		a.add(9);
		System.out.println("The Array is :\n"+a);
		plusOne(a);
		System.out.println("After Increment, The Array is :\n"+a);
		

	}

}