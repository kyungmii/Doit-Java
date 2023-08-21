package ch09;

import java.util.List;

import org.apache.catalina.User;


public interface StudentMapper {
	public List<Student> getUsers(); 
	public void insertUser(User u);
	public void insertStudent(Student s);
	public List<Student> getStudents();
	
}
