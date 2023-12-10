package chapter5;

public class Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
