package Array;

import java.util.*;

public class ROTATE_A_2D_ARRAY{
	public static List<List<Integer>>transpose(List<List<Integer>>s){
		for(int i=0;i<s.get(0).size();i++) {
			for(int j=i+1;j<s.get(0).size();j++) {
				int t1=s.get(i).get(j);
				int t2=s.get(j).get(i);
				s.get(i).set(j, t2);
				s.get(j).set(i, t1);
			}
		}
		return s;
	}
	public static List<List<Integer>>rotate(List<List<Integer>>s1){
		int m=s1.get(0).size();
		for(int i=0;i<m;i++) {
			for(int j=0;j<m/2;j++) {
				int t1=s1.get(i).get(j);
				int t2=s1.get(i).get(m-1-j);
				s1.get(i).set(j, t2);
				s1.get(j).set(m-1-j, t1);
			}
		}
		return s1;
	}
	public static void main(String[] args) {
		List<List<Integer>>x=new ArrayList<List<Integer>>();
		x.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		x.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
		x.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
		x.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
		//x.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		//x.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		//x.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		for(int i=0;i<x.get(0).size();i++)
			System.out.println(x.get(i));
		List<List<Integer>>x1=transpose(x);
		System.out.println("The tranpose is ");
		for(int i=0;i<x1.get(0).size();i++)
			System.out.println(x1.get(i));
		List<List<Integer>>x2=rotate(x1);
		System.out.println("After rotating,The matrix is:");
		for(int i=0;i<x2.get(0).size();i++)
			System.out.println(x2.get(i));
	}
}
