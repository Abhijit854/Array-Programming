package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sample_offline_Data {
	public static void randomsampling(int k, List<Integer> A) {
		Random gen = new Random (); 
		System.out.println("swapping elements are:");
		for (int i =0; i < k; ++i) {
			// Generate a random int in [i, A.size() - 1].
		    Collections . swap (A , i, i + gen.nextInt (A . size () - i));
		    System.out.println("r="+(i+gen.nextInt (A . size () - i))+"  A"+A);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(7);
		a.add(5);
		a.add(11);
		a.add(17);
		a.add(95);
		a.add(411);
		int k=7;
		System.out.println("k"+k);
		System.out.println("a"+a);
		randomsampling(k,a);
	}

}
