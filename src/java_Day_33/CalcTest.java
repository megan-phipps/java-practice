package java_Day_33;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Warm_up.add(3, 1));
		System.out.println(Warm_up.divide(4, 7));
		System.out.println(Warm_up.multiply(100, 4));
		System.out.println(Warm_up.subtract(7, 2));
		
		double addResult = Warm_up.add(21, 41);
			System.out.println("addResult: " + addResult);
		double mResult = Warm_up.multiply(50, 40);
			System.out.println("mResult: " + mResult);
		double miResult = Warm_up.subtract(3000, 200);
			System.out.println("miResult: " + miResult);
		double dResult = Warm_up.divide(455, 5);
			System.out.println("dResult: " + dResult);
			
		double a = 10.0, b = 5.0;
		double myresult = Warm_up.subtract(a, b);
			
		double [] dNums = {2.0, 4.0};
		double result2 = Warm_up.multiply(dNums[0], dNums[1]);
		System.out.println("result2 " + result2);
		
		if(Warm_up.add(10, 16) == 26) {
			System.out.println("Add unit test passed");
		}else {
			System.out.println("Add unit test failed");
		}
		
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 chars");
		}else {
			System.out.println("It is not 4 chars");
		}
			
	}
}
