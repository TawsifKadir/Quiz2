package quiz2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Raihan Ahmed","Mirpur");
		//System.out.print(student.toString());
		student.addCourseGrade("CSE115", 89);
		student.addCourseGrade("CSE215", 57);
		student.addCourseGrade("CSE225", 96);
		System.out.println(student.toString());
		student.printGrades();
		System.out.printf("Average: %.2f",student.getAverageGrade());
	}

}
