package java_Day_46;

public class A_Notes {
	//static - you can access without creating an object
		//just by using a class name
	//static members belong to a class itself, they are also
		//class members.
		//member: variable and method
		//Static methods can only access other static variables or methods,
			// static methods cannot call other non-static instance variable.
	
	//what can be static?
		//static variables(aka shared variable)
		//static methods
		//static blocks
		//static inner/nested classes
	
	//static variables:
		//are also called shared variables, it will have only
			//one copy of it. Every object of the class will 
			//share the value of it.
	
	//Static methods - a method that can be called using a class name without creating an object.
	//Objects can also call static methods.
	
	//Ex: Everything in Math class is static
	
	//When to use static methods:
		//Whenever your method does not depend on instance variable values, then we 
			//can make our methods static
		//When methods can run individually without running on object data 
			//(such as instance variables), then that method is a good candidate for static method
		//When we have encapsulated instance variables, if we need methods to work with those variables,
			//then those methods need to be non-static.
	
	//In general programming, most of your methods will be non-static,
		//utility methods (aka helper methods) - usually are static methods
	
	//Integer.parseInt("400");
	//Is this static?
		//yes, you are accessing through the class. Only the static method allows you
			//to access through the class.
	
	//Interview Question: System is class name. Out is a static variable declared in the System class. 
	// println is a non-static method
	
	//System.      out.       println();
	//H_Company.   cName.     toUpperCase()
	// class       variable   method
	
	//Whenever all your method in your class are static and you want everyone to call them 
	//in the static way(Classname.nethodName()), then you can simply make your constructor private. 
	//Below line is not possible
	//Math.round(434.4);
	
	//Static variables and static methods belong to class itself, and can be called directly 
		//using a class name
	
	//Static variable is a shared variable, there is only one central copy of it.
		//All objects will share its value, same for everyone.
	
	//Static methods can use/refer to other static variables and methods, but 
		//cannot call/use anything non-static
	
	//non-static instance methods and constructors can call/access any static variables or 
		//static methods.

	//Static block (aka static initializer block) - Code in static block executes only ONCE and BEFORE 
		//EVERYTHING ELSE, whenever the class is used. Usually, we can place static variable
		//initializations or set up code into static block.
		
	//We can use static block to initialize static variables
	
	//We can also use multiple static blocks and they will run from top to bottom before anything else. 
		//Ex: BriteERB login, you only want to do it once
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
