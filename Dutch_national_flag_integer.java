package Array;
import java.util.Scanner;


public class Dutch_national_flag_integer {
	public static void SORT(int arr[], int arr_size)   
	{   
		int low = 0;   
	    int high = arr_size - 1;   
	    int mid = 0;
	    while (mid <= high)   
	    {   
	    	switch (arr[mid])   
	    	{  
	    	case 0: // Here mid pointer points is at 0.  
	    		{   
	    			SWAP(arr,low,mid);
	                low++;   
	                mid++;   
	                break;  
	            }   
	    		case 1: // Here mid pointer points is at 1.  
	    			mid++;   
	                break;   
	                case 2: // Here mid pointer points is at 2.  
	                	{   
	                		SWAP(arr,mid,high);
	                		high--;   
	                		break;   
	                    }   
	       }   
	   }   
	}   
	// Now we have to call function to print array arr[]   
	public static void printArray(int arr[], int arr_size){   
		int i;   
	    for (i = 0; i < arr_size; i++)  
	    	System.out.print(arr[i]+" ");   
	        System.out.println("");   
	}
	public static void SWAP(int[] a,int m,int n) {
		int temp = a[m];   
		       a[m] = a[n];   
	           a[n] = temp;   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}   
		System.out.println("Array before executing the DNFS algorithm : ");     
		printArray(arr, arr.length);
		SORT(arr, arr.length);   
		System.out.println("\nArray after executing the DNFS algorithm : ");   
		printArray(arr, arr.length);
		sc.close();

	}

}