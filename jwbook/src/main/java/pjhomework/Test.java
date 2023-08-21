package pjhomework;

public class Test {

	School KMschool = School.getInstance();
	Subject korean;
	Subject math;
	// Subject dance;

	General_TYPEReport gernaltypereport = new General_TYPEReport();

	public static void main(String[] args) {
		Test test = new Test();

		test.creatSubject();
		test.createStudent();

		String report = test.gernaltypereport.getReport();
		System.out.println(report);

	}

	public void creatSubject() {
		korean = new Subject(" 국어 ", Define.Korean);
		math = new Subject(" 수학 ", Define.Math);

		KMschool.addSubject(korean);
		KMschool.addSubject(math);


	}

	public void createStudent() {
		Student student1 = new Student(181213, "안성원", korean);
		Student student2 = new Student(181513, "오태훈", math);
		Student student3 = new Student(171230, "이동호", korean);
		Student student4 = new Student(171255, "조성욱", korean);
		Student student5 = new Student(171590, "최태평", math);

		KMschool.addStudent(student1);
		KMschool.addStudent(student2);
		KMschool.addStudent(student3);
		KMschool.addStudent(student4);
		KMschool.addStudent(student5);

		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);

		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);

		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
	

		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
	

		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
	
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);

		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);

	}

	// 과목별 성적 입력
	public void addScoreForStudent(Student student, Subject subject, int point) {

		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);

	}
}