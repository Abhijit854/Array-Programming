package Array;

import java.util.*;

public class GENERATE_NONUNIFORM_RANDOM_NUMBERS {
	public static int nonuniformRandomNumberGeneration(List<Integer>values,List<Double>probabilities) {
		List<Double> prefixSumOfProbabilities = new ArrayList <>() ;
		prefixSumOfProbabilities . add(0.0) ;
		for (double p : probabilities) {
			prefixSumOfProbabilities.add(prefixSumOfProbabilities.get(prefixSumOfProbabilities.size()-1)+p);
		}
		Random r = new Random () ;
		final double uniform01 = r.nextDouble () ;
		int it = Collections .binarySearch(prefixSumOfProbabilities,uniform01);
		if (it < 0) {
			final int intervalIdx = (Math . abs(it) - 1) - 1;
		    return values . get ( intervalIdx) ;
		} 
		else {
		return values . get(it);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> c=new ArrayList<Integer>();
			c.add(3);
			c.add(5);
			c.add(7);
			c.add(11);
			System.out.println("Numbers are:- "+c);
			ArrayList<Double> d=new ArrayList<Double>();
			d.add(0.5);
			d.add(0.3333);
			d.add(0.1111);
			d.add(0.5555);
			System.out.println("The probabilities are:- "+d );
			System.out.println("Nonuniform random number generation:- "+nonuniformRandomNumberGeneration(c, d));

		}

}
