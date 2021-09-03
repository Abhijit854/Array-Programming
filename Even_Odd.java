package Array;

import java.util.Scanner;

public class Even_Odd {
	public static void evenOdd(int[] A){
		int nextEven = 0, nextOdd = A.length - 1;
		while (nextEven < nextOdd) {
		if (A[nextEven] % 2 == 0) {
		nextEven++;
		} else {
		int temp = A[nextEven];
		A[nextEven] = A[nextOdd];
		A[nextOdd--] = temp;
		   }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<=5;i++)
		{
			a[i]=sc.nextInt();
		}
		evenOdd(a);
		System.out.println("The elements are in such a manner:");
		for(int i=0;i<=5;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
		

	}

}