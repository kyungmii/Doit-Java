package pjhomework;

import java.util.ArrayList;

public class Subject {
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>() ;
	//수강신청 학생 리스트 
	
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
		
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public void register(Student student) {
		studentList.add(student);
		
	}
	

}
