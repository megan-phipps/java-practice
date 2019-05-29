package java_day_50;

public class AppsFactory {
	public static void main(String[] args) {
		
	IphoneApp iApp = new IphoneApp();
	IphoneApp iApp2 = new IphoneApp("uber");
	
	AndroidApp andrApp = new AndroidApp();
	AndroidApp andrApp2 = new AndroidApp("lyft");
	
	System.out.println(iApp.getName());
	System.out.println(iApp2.getName());
	
	System.out.println(andrApp.getName());
	System.out.println(andrApp2.getName());
	
	App.count = 33;
	System.out.println(IphoneApp.count);
	AndroidApp.count = 100;
	System.out.println(IphoneApp.count);
	System.out.println(App.count);
	System.out.println(AndroidApp.count);
	
	App.build("swift");
	IphoneApp.build("objective C");
	AndroidApp.build("Java");
	
	andrApp2.build("JS");
	
	
	
	
	
	
	
	
	}	
}
