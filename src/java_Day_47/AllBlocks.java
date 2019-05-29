package java_Day_47;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;
	
	
	static {
		System.out.println("STATIC BLOCK - I run first and only once");
		staticInt--;
	}
	
	{
		System.out.println("INIT BLOCK - I run each time object is created. Before constructor" );
		//init block can use static and non-static
		staticInt += 5;
		nonStaticInt += 5;
		
	}
	
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time an object is created after static block and init block.");
		nonStaticInt += 3;
		staticInt += 3;
	}
	
}
