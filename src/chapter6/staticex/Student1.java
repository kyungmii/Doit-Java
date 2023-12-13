package chapter6.staticex;

public class Student1 {
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성됨 
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		studentId = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
