package chapter5;

public class StudentTest2 {
public static void main(String[] args) {
	Student student1 = new Student();
	student1.studentName = "�ȿ���";

	Student student2 = new Student();
	student2.studentName = "�Ƚ¿�";
	
	System.out.println(student1);//���� ���� �� ��� 
	System.out.println(student2);  //���� ���� �� ��� 
}
}
//��ü : ��ü ���� ���α׷��� ���, ������ �ν��Ͻ� 
//Ŭ���� : ��ü�� ���α׷��� �ϱ� ���� �ڵ�θ��� ����
//�ν��Ͻ� : Ŭ������ �޸𸮿� ������ ����
//�������: Ŭ������ �Ӽ�, Ư��
//�޼��� : ��� ������ �̿��Ͽ� Ŭ������ ����� ����
//���� ���� : �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����
//���� �� : ������ �ν��Ͻ��� �޸� �ּҰ� 