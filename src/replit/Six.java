package replit;
import java.util.*;

public class Six {
public static void main(String[] args) {
	

	/*Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers
	 *  in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
	Example:
	input (outer): 1, 2, 4, 6
	input (inner): 2, 4
	output: true

	Example:
	input (outer): 1, 2, 4
	input (inner): 6, 5
	output: false
	*/
	
	    Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			
			//WRITE YOUR CODE HERE
//			int count = 0;
//			for(int i = 0; i <= inner.length-1; i++) {
//				for(int q = 0; q <= outer.length-1; q++) {	
//					if(inner[i] == outer[q]) {
//						count++;
//					}
//				}
//			}
//			if(count == inner.length && count > 0) {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
			
			for(int i = 0; i < inner.length-1; i++) {
				if(Arrays.binarySearch(outer, inner[i]) < 0) {
					System.out.println("false");
					return;
				}
			}
			System.out.println("true");
			
			
   }		
}
  
