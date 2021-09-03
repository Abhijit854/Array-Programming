package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dutch_National_Flag_2 {
	public static  enum Color { RED,WHITE,BLUE}
	public static void dutchFlagPartition(int pivotlndex , List<Color> A) {
	Color pivot = A.get(pivotlndex);
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
		List<Color> e=new ArrayList<Color>();
		e.add(Color.BLUE);
		e.add(Color.RED);
		e.add(Color.WHITE);
		e.add(Color.RED);
		e.add(Color.BLUE);
		e.add(Color.BLUE);
		e.add(Color.WHITE);
		System.out.println("Enter the elements in array:\n"+e);
		dutchFlagPartition(pivot_index,e);
		System.out.println("The Array after executing the DNFS Algorithm is: ");
		System.out.print(e);

	}

}