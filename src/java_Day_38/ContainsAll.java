package java_Day_38;
import java.util.*;
public class ContainsAll {
	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40); nums1.add(50);
		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20); nums2.add(10); nums2.add(40); nums2.add(30);
		
		//See if nums1 contains all the values in nums2
		System.out.println(nums1.containsAll(nums2)); //prints true
		
		//putting it in an if condition
		if(nums1.containsAll(nums2)) {
			System.out.println("Num1 contains all values that nums2 contains"); //prints this
		}else {
			System.out.println("Num1 does not contain all values that nums2 contains");
		}
		
		List<String> planA = new ArrayList<>();
		planA.add("java"); 
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		System.out.println(planA.containsAll(planB) && planB.containsAll(planA)); //prints true
		
		
		
		
		
		
		
		
	}
}
