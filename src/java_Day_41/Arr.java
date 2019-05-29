package java_Day_41;
import java.util.Arrays;
public class Arr {
	public static void main(String[] args) {
		
		int[][] data = { {12, 5, 4} , {23, 113, 32} };
		
		for(int i = 0; i <= data.length-1; i++){
		
				for(int j = 0; j <= data[i].length-1; j++){
					System.out.println("Row: " + (i+1) + " value "+ data[i][j] + " ");
			}
		}
		
		for(int i = 0; i <= data.length-1; i++){
			System.out.print("Row: ");
			System.out.println(i+1);

				for(int j = 0; j <= data[i].length-1; j++){
					System.out.println(data[i][j]);
				}
			}
		
		System.out.println("************************");
		
		for(int[] temp1: data){
			System.out.println(Arrays.toString(temp1));
		}
		
		
		
	}
}
		
	


