package java_Day_47;

public class A_VariableAccess {
	int myInstanceVar = 40;
	static int myStaticVariable = 55;
	
	
	public static void main(String[] args) {
		//System.out.println(myInstanceVar);
		//main method is static. Cannot use a non-static 
		//variable without creating an object.
		A_VariableAccess v = new A_VariableAccess();
		System.out.println(v.myInstanceVar);
		
		//print static variable directly since we are 
			//in the same class
		System.out.println(myStaticVariable);
		//print static variable by using class name  
		System.out.println(A_VariableAccess.myStaticVariable);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
