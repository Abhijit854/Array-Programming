package Array;

import java.util.*;

public class COMPUTE_THE_SPIRAL_ORDERING_OF_A_2D_ARRAY_2 {
	public static List<Integer>matrixInSpiralOrder(List<List<Integer>>squareMatrix) {
		final int[][] SHIFT = {{0 , 1}, {1, 0} , {0, -1}, {-1, 0}};
		int dir = 0, x = 0 , y = 0 ;
		List<Integer> spiralOrdering = new ArrayList <>();
		for (int i = 0; i < squareMatrix.size() * squareMatrix.size(); ++i) {
			spiralOrdering.add(squareMatrix.get(x).get(y));
		    squareMatrix.get(x).set(y , 0);
		    int nextX = x + SHIFT[dir][0], nextY = y + SHIFT[dir][1];
		    if (nextX<0||nextX>=squareMatrix.size()||nextY<0||nextY>=squareMatrix.size()||squareMatrix.get(nextX).get(nextY)==0) {
		    	dir = (dir + 1) % 4;
		        nextX = x + SHIFT[dir][0];
		        nextY = y + SHIFT[dir][1];
		    }
		    x = nextX;
		    y = nextY ;
		}
		return spiralOrdering;
	}
  public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<List<Integer>> a=new ArrayList<List<Integer>>();
	a.add(new ArrayList<Integer>());
	a.get(0).add(0, 1);
	a.get(0).add(1, 2);
	a.get(0).add(2, 3);
	a.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
	a.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
	System.out.println("Matrix(3*3):- "+a);
	System.out.println("Spiral order: "+matrixInSpiralOrder(a));
	List<List<Integer>> b=new ArrayList<List<Integer>>();
	b.add(new ArrayList<Integer>());
	b.get(0).add(0, 1);
	b.get(0).add(1, 2);
	b.get(0).add(2, 3);
	b.get(0).add(3, 4);
	b.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
	b.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
	b.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
	System.out.println("Matrix(4*4):- "+b);
	System.out.println("Spiral order: "+matrixInSpiralOrder(b));

 }
}
