package java_Day_45;
import java.util.*;
public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
		
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Murodil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");
		
		course1.setTeachers(teachers); //setting to the teachers List
		System.out.println(course1.toString());
		
		List<String> students = new ArrayList<>();
		students.add("Burak");
		students.add("Gulnar");
		students.add("Ethem");
		students.add("Roman");
		students.add("Sung");
		
		course1.setStudents(students);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Ekaterina");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Ekaterina")) {
			System.out.println("Ekaterina is a student");
		}else {
			System.out.println("Ekaterina is not a student");
		}
		
		course1.removeTeachers("Maria");
		course1.removeStudent("Roman");
		
		if(course1.getStudents().contains("Roman")) {
			System.out.println("Error removing student");
		}else {
			System.out.println("Student removed sucessfully");
		}
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Error removing teacher");
		}else {
			System.out.println("teacher removed sucessfully");
		}
		
		
	
		
		
	}
}
