package java_Day_16;

public class ExtraEnd {
	public static void main(String[] args) {
	String str = "selenium";
	String results = "";
	if (str.length() == 2) {
		results = str + str + str;
	}else {
		results = str.substring(str.length()-2);
		results += results + results;
	}
	System.out.println(str);
}
}
