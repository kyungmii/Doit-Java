package chapter6.staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + "학번:" + studentLee.studentId);

		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentId);

		//7행과 12행은 serialNum 변수를 직접 클래스 이름으로 참조 
	}
}
