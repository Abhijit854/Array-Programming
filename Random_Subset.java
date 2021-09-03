package Array;


import java.util.*;

public class Random_Subset {
	public static List<Integer> randomSubset(int n, int k) {
		Map<Integer , Integer> changedElements = new HashMap<>();
		Random randldxGen = new Random();
		for (int i = 0; i < k; ++i){
			// Generate random int in [i, n - 1].
		    int randldx = i + randldxGen.nextInt(n - i);
		    System.out.println("Random Number : "+randldx);
		    Integer ptrl = changedElements.get(randldx);
		    Integer ptr2 = changedElements.get(i);
		    if (ptrl == null && ptr2 == null){
		    	changedElements.put(randldx , i);
		        changedElements.put(i, randldx);
		        System.out.println(changedElements+"\n");
		    }
		    else if (ptrl == null && ptr2 != null){
		    	changedElements.put(randldx , ptr2);
		        changedElements.put(i, randldx);
		        System.out.println(changedElements+"\n");
		    } 
		    else if (ptrl != null && ptr2 == null){
		        changedElements.put(i , ptrl);
		        changedElements.put(randldx , i);
		        System.out.println(changedElements+"\n");
		    } 
		    else{
		        changedElements.put(i , ptrl);
		        changedElements.put(randldx , ptr2);
		        System.out.println(changedElements+"\n");
		    }
	 }
		List<Integer> result = new ArrayList<>(k);
		for (int i = 0; i < k; ++i) 
		{
			result.add(changedElements.get(i));
		}
		return result;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n and k : ");
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer> A=randomSubset(n,k);
		System.out.println("The Random Subset is : "+A);

	}

}
