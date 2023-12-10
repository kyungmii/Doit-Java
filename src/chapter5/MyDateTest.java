package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizMyDate date1 = new QuizMyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		QuizMyDate date2 = new QuizMyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}

}
