package java_Day_47;

public class C_MainTestData {
	public static void main(String[] args) {
		//to print static variable, you can print without 
		//creating an object. just call the other class
		System.out.println(B_TestData.url);
		
		String briteErpUrl = B_TestData.url;
		System.out.println(briteErpUrl);
		
		System.out.println(B_TestData.email);
		B_TestData td = new B_TestData();
		System.out.println(td.email);
		
		
		
		
	}
}
