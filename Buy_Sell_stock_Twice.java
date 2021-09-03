package Array;

import java.util.ArrayList;
import java.util.List;

public class Buy_Sell_stock_Twice {
	public static double buyAndSellStockTwice(List<Double> prices) {
		double maxTotalProfit =0.0;
		List<Double> firstBuySellProfits = new ArrayList<>();
		double minPriceSoFar = Double.MAX_VALUE ;
		// Forward phase. For each day, we record maximum profit if we
		// sell on that day.
		for (int i = 0; i < prices.size(); ++i) {
			minPriceSoFar = Math.min(minPriceSoFar , prices.get(i));
			maxTotalProfit = Math.max(maxTotalProfit , prices.get(i) - minPriceSoFar);
			firstBuySellProfits.add(maxTotalProfit);
		}
		// Backward phase. For each day, find the maximum profit if we make
		// the second buy on that day.
		double maxPriceSoFar = Double.MIN_VALUE ;
		for (int i = prices.size() - 1; i > 0; --i) {
			maxPriceSoFar = Math.max(maxPriceSoFar , prices.get(i));
			maxTotalProfit= Math.max(maxTotalProfit , maxPriceSoFar - prices.get(i)+ firstBuySellProfits.get(i - 1));
		}
			return maxTotalProfit ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> a = new ArrayList<Double>();
		a.add(12.0);
		a.add(11.0);
		a.add(13.0);
		a.add(9.0);
		a.add(12.0);
		a.add(8.0);
		a.add(14.0);
		a.add(13.0);
		a.add(15.0);
		System.out.println("The Array is :\n"+a);
		System.out.println("Output: " + buyAndSellStockTwice(a));
	}

}
