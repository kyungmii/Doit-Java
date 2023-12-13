package chapter6;

//this 로 다른 생성자 호출 하기 
class Person {
	String name;
	int age;

	Person() {
		this("이름없음", 1); // this 를 사용해 Person(String , int) 생성자 호출-> 밑 Person 
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//반환형은 클래스형으로 
	Person returnItSelf() {
		return this; //this 반환 
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
