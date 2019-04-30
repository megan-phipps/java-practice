package java_Day_25;

public class Shopping_2 {
	public static void main(String[] args) {
		String [] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};
		double [] prices  = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int [] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		//print count of products
		System.out.println("products count: " + products.length);
		
		//check if products, prices, and itemIds have same count
		if(products.length == prices.length && prices.length == itemsId.length && products.length == itemsId.length) {
			System.out.println("shopping list looks good");
		}else {
			System.out.println("something is wrong with shopping list");
			return;
		}
		
		//loop through product and print each one in separate line
		for(String temp: products) {
			System.out.println(temp);
			}for(int i = 0; i <= prices.length-1; i++) {
				System.out.println(prices[i]);
				
				//print id's in reverse order
				}for(int q = itemsId.length-1; q >= 0; q--) {
					System.out.println(itemsId[q]);
				}
		
		//merge them so array says item, price, and id in one line
		//print total price
		double totalPrice = 0.0;
		for(int i = 0; i <= products.length-1; i++) {
			System.out.println("Item " + (i+1) + ": " + itemsId[i] + " - " + products[i] + " - $" + prices[i] );
			totalPrice += prices[i];
		}
		System.out.println("total Price: $" + totalPrice);
					
		//find the most expensive item in your list and print as a report
		
		double max = Integer.MIN_VALUE;
		
		for(int i = 0; i <= prices.length-1; i++) {
			if(prices[i] > max) {
				max = prices[i];
			}
		}
		System.out.println(max);
		
		
		
}
}
	

