package java_Day_45;
import java.util.*;
public class Course {
	private String name;
	private List<String> teachers = new ArrayList<>(); 
	private List<String> students = new ArrayList<>();
	
	public void addStudent(String studentName) {
		students.add(studentName);
	}
	public void addTeacher(String teacherName) {
		teachers.add(teacherName);
	}
	public void removeStudent(String studentName) {
		students.remove(studentName);
	}
	public void removeTeachers(String teacherName) {
		teachers.remove(teacherName);
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
