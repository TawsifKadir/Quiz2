package quiz2;

public class Student {
	private String name;
	private String address;
	private int numCourses;
	private String[] courses = new String[30];
	private int[] grades = new int[30];
	
	public Student(String name,String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)",this.name,this.address);
	}
	
	public void addCourseGrade(String course,int grade) {
		this.courses[this.numCourses] = course;
		this.grades[this.numCourses] = grade;
		numCourses++;
	}
	
	public void printGrades() {
		for(int i=0;i<this.numCourses;i++) {
			System.out.printf("%s:%s\n",this.courses[i],this.grades[i]);
		}
	}
	public double getAverageGrade() {
		double sum = 0;
		for(int i=0;i<this.numCourses;i++) {
			sum+= this.grades[i];
		}
		return sum/this.numCourses;
	}
}

