package Array;

public class COMPUTE_THE_SPIRAL_ORDERING_OF_A_2D_ARRAY_3 {
	public static void print(int[][] m, int r,int c) {
		int lr=r-1,k=0;
		int lc=c-1,l=0;
		int i=0;
		while(k<=lr && l<=lc) {
			for(i=l;i<=lc;++i) {
				System.out.print(m[k][i]+" ");
			}
			k++;
			for(i=k;i<=lr;++i) {
				System.out.print(m[i][lc]+" ");
			}
			lc--;
			if(k<=lr) {
				for(i=lc;i>=l;--i) {
					System.out.print(m[lr][i]+" ");
				}
				lr--;
				for(i=lr;i>=k;--i) {
					System.out.print(m[i][l]+" ");
				}
				l++;
			}	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={
				   {1,2,3},
				   {4,5,6},
				   {7,8,9},
				 };
		System.out.println("Matrix(3*3):-");
		for(int i=0;i<3;++i) {
			for(int j=0;j<3;++j) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("spiral elements:-");
		print(a,3,3);
		System.out.println();
		System.out.println();
		int b[][]={
				   {1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12},
				   {13,14,15,16},
				 };
		System.out.println("Matrix(4*4):-");
		for(int i=0;i<4;++i) {
			for(int j=0;j<4;++j) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("spiral elements:-");
		print(b,4,4);

	}
}
