package Array;

import java.util.ArrayList;
import java.util.List;

public class Advance_Trough_Array {
	public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
		int furthestReachSoFar = 0, lastlndex = maxAdvanceSteps.size() - 1;
		for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastlndex;++i) {
			furthestReachSoFar= Math.max(furthestReachSoFar , i + maxAdvanceSteps.get(i));
		}
		return furthestReachSoFar >= lastlndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(0);
		a.add(0);
		a.add(2);
		a.add(0);
		a.add(1);
		System.out.println("The Array is :\n"+a);
		boolean K=canReachEnd(a);
		System.out.print("Can it reach at the end : ");
		if(K==true)
		{
			System.out.print("YES -->"+K);
		}
		else System.out.print("NO -->"+K);

	}
}
