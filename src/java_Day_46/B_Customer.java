package java_Day_46;

public class B_Customer {
	private String name;
	private String email;
	static int count; //without static count is 1 for each object
	//with static count is shared. so it is 3 for all the objects. 
	//can access using object name or class name
		//Ex: B_Customer.count or cm3.count
		//If you change the count value for Abdallah to 10, the count stays at 10
	
	public B_Customer(String name, String email){
		setName(name);
		setEmail(email);
		count++;
	}
	
	public B_Customer() {
		name = "undefined";
		email = "undefined";
		count++;
	}
	
	public String getName() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "B_Customer [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
}
