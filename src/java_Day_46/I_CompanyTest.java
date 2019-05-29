package java_Day_46;

public class I_CompanyTest {
	public static void main(String[] args) {
		//print company name using cName variable, not method
		System.out.println("The company name is " + H_Company.cName);
			//Do not need object because it is static, we can call it right away 
		
		//Print the company name in all uppercase letters
		System.out.println("Changing company name to uppercase " + H_Company.cName.toUpperCase());
		
		//System.      out.       println();
		//H_Company.   cName.     toUpperCase()
		//class.       variable.  method
		
		//You can also create a new company object and use the cName instance variable,
		//It will show a warning but it is okay
		H_Company c = new H_Company();
		System.out.println(c.cName);
		c.companyInfo();
		System.out.println(Math.round(455.68));
		
		
		
					 
					  
			
				  
				  
				  
			}
		
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	}

	
	
	

