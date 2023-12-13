package chapter6.staticex;

public class Student2 {

	private static int serialNum = 1000; // private 변수로 변경

	int studentId;
	String studentName;
	int grade;
	String address;

	public Student2() {
		serialNum++;
		studentId = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
