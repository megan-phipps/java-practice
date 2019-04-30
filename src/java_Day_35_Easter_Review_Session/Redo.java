package java_Day_35_Easter_Review_Session;

public class Redo {
	public static void main(String[] args) {
		
		int[] array = {234, 65,7,5,3,3, 35,8, 8, 9, 9,565};
		System.out.println(uniqueCount(array));
	}
		
	
	public static String uniqueCount(int[] array) {
	
		
		String uniqueNumber = "";
		for (int i = 0; i <= array.length-1; i++) {
			int count = 0;
			for(int q = 0; q <= array.length-1; q++) {
				if(array[i] == array[q])
					count++;
			}
			if(count > 1) {
				uniqueNumber +=  array[i];
			}
		}
		return uniqueNumber;
	}
	
		
		
		
		
		
		
}
