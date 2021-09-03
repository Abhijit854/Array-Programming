package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Dutch_National_Flag_3_Integer {
	public static enum Integer{_0_,_1_,_2_}
	private static final Integer Integer = null;
	public static void dutchFlagPartition(int pivotlndex , List<Integer> A) {
		Integer pivot = A.get(pivotlndex); 
		int smaller = 0, equal = 0, larger = A.size();
		while (equal < larger) {
			if (A.get(equal).ordinal() < pivot.ordinal()){
				Collections.swap(A , smaller++, equal++);
				}
		    else if (A.get(equal).ordinal() == pivot.ordinal()){
		       ++equal ;
		          }
		    else
		    {
		    	Collections.swap(A , equal, --larger);
		    }
		 }
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pivot_index=2;
		List<Integer> e=new ArrayList<Integer>();
		e.add(Integer._2_);
		e.add(Integer._0_);
		e.add(Integer._1_);
		e.add(Integer._0_);
		e.add(Integer._2_);
		e.add(Integer._2_);
		e.add(Integer._1_);
		System.out.println("Enter the elements in array:\n"+e);
		dutchFlagPartition(pivot_index,e);
		System.out.println("The Array after executing the DNFS Algorithm is: ");
		System.out.print(e);

	}

}
