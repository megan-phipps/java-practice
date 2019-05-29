package java_day_52;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
		
	}

	public static void staticMethod(String word) {
		System.out.println("static method: " + word);
	}
	
	//Static methods can also be final, but we cannot override them in child classes
//	public static void staticMethod(String word) {
//		System.out.println("static method: " + word);
//	}

//We can use final method when the behavior of the class should be same for all objects and child classes.



	//cannot override because it is a final method, you can overload thought
	//b/c when you overload, Java looks at it like it is a different method
//class Sub extends FinalMethods{
//	public final void method1() {
//		System.out.println("Override Final method 1");
//		
//	}
//}


	public final void method1(String str) {
		System.out.println("Final method 1");
		
	}
}