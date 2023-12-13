package chapter6.staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + "학번:" + studentLee.studentId);

		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentId);

	}
}
//7행과 12행의 	(Student2.getSerialNum() => serialNum값을 가져오기 위해 get() 메스드를 클래스 이름으로 직접 호출 
