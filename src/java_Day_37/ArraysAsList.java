package java_Day_37;
import java.util.*;
public class ArraysAsList {
		public static void main(String[] args) {
			
			List<Integer> nums = Arrays.asList(2,334,545,6,7);
			System.out.println(nums.size());
			System.out.println(nums.toString());
//			nums.add(100);						//if you assign all number in one line you can no longer edit ArrayList
//			System.out.println(nums.toString()); 
			
			List<Integer> list = Arrays.asList(10,20);
			
			List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 34.34, 345.54, 54.87, 78.12);
				System.out.println(prices);
				//calculate sum of all prices
				double sum = 0;
				double sum2 = 0;
				for(int i = 0; i <= prices.size()-1; i++) {
					sum+= prices.get(i);
				}
				System.out.println(sum);
				System.out.println("************************");
				
				for(Double price: prices) {
					sum2+= price;
				}
				System.out.println("Sum: " + sum);
				
				//create new list expensive
				//add prices that are more than 100
				int sum3 = 0;
				List<Double> expensive = new ArrayList<>();
					for(double price: prices) {
						if(price > 100.00) {
							expensive.add(price);
						}
					}
					System.out.println("Expensive: " + expensive.toString());
				
		}
	}

