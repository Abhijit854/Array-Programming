package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Sample_online_data {
	// Assumption: there are at least k elements in the stream.
	public static List<Integer> onlineRandomSample(Iterator<Integer> sequence,int k) {
		
	    List<Integer> runningSample = new ArrayList<>(k);
	    // Stores the first k elements.
	    for (int i =0; sequence.hasNext() && i < k ; ++i) {
	    	runningSample.add(sequence.next());
	    }
	    // Have read the first k elements.
	    int numSeenSoFar = k;
	    Random randldxGen = new Random();
	    while (sequence.hasNext()){
	    	Integer x = sequence.next();
	        ++numSeenSoFar ;
	        // Generate a random number in [Q, numSeenSoFar], and if this number is in
	        // [9, k - 1], we replace that element from the sample with x.
	        final int idxToReplace = randldxGen.nextInt(numSeenSoFar);
	        if (idxToReplace < k) {
	        	runningSample.set(idxToReplace, x);
	        }
	    }
	    return runningSample ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		System.out.println("The ArrayList is : "+A);
		int k=2;
		Iterator<Integer> s=A.iterator();
		List<Integer> B=onlineRandomSample(s,k);
		System.out.println("The resulting array is : "+B);
	}

}
