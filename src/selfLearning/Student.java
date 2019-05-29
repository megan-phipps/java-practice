package selfLearning;

public class Student {
	private String name;
	private int age;
	private String university;
	private String major;
	private boolean undergraduate;

	public Student(String name, int age, String major) {
		setName(name);
		setAge(age);
		setMajor(major);
	}
	
	public Student(String name, int age, String major, String university, boolean undergraduate) {
		setName(name);
		setAge(age);
		setUniversity(university);
		setMajor(major);
		setUndergraduate(undergraduate);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void over18(int age) {
	if (age > 18) {
		this.age = age;
		}
	}
	
	public void setAge(int age) {
		over18(age);
	}

	public int getAge() {
		return age;
	}
	
	public void harvard(String university) {
		if (university.equalsIgnoreCase("Harvard"));
			this.university = university;
	}
	
	public void setUniversity(String university) {
		harvard(university);
	}

	public String getUniversity() {
		return university;
	}

	public void mathOrScience(String major) {
	if (major.equalsIgnoreCase("math") || major.equalsIgnoreCase("science")) {
		this.major = major;
		}
	}
	
	public void setMajor(String major) {
		mathOrScience(major);
	}

	public String getMajor() {
		return major;
	}

	public void undergrad(boolean undergraduate) {
	if (undergraduate) {
		this.undergraduate = undergraduate;
	} else {
		this.undergraduate = false;
		}
	}
	
	public void setUndergraduate(boolean undergraduate) {
		undergrad(undergraduate);
	}

	public boolean isUndergraduate() {
		return undergraduate;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", university=" + university + ", major=" + major
				+ ", undergraduate=" + undergraduate + "]";
	}
	
	
	
	
	
}
