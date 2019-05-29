package java_day_51;

public class AtTheGym {
	public static void main(String[] args) {
		
		Exercise exercise = new Exercise();
		Running run = new Running();
		Swimming swim = new Swimming();
		Yoga yoga = new Yoga();
		JuiJitsu j = new JuiJitsu();
		
		System.out.println("General exercise burns " + exercise.perform(30) + " calories");
		System.out.println("Running burns " + run.perform(30) + " calories");
		System.out.println("Swimming burns " + swim.perform(30) + " calories");
		System.out.println("Yoga burns " + yoga.perform(30) + " calories");
		System.out.println("JuiJitsu burns " + j.perform(30) + " calories");
		
		System.out.println("**************************");
		
		Sprint sprint = new Sprint();
		System.out.println("Sprinting burns " + sprint.perform(30) + " calories");
		
		System.out.println("**************************");
		
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perform(30));
		
		
		
		
		
		
		
		
		
		
	}
	
}
