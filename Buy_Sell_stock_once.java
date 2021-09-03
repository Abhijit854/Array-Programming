package Array;

import java.util.ArrayList;
import java.util.List;

public class Buy_Sell_stock_once {
	public static double computeMaxProfit(List<Double> prices) {
		double minPrice = Double.MAX_VALUE , maxProfit = 0.0;
		for (Double price : prices) {
			maxProfit = Math.max(maxProfit , price - minPrice);
		    minPrice = Math.min(minPrice , price);
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> a = new ArrayList<Double>();
		a.add(223.0);
		a.add(345.0);
		a.add(23.55);
		a.add(123.5);
		System.out.println("The Array is :\n"+a);
		System.out.println("Output: " + computeMaxProfit(a));
	}

}
