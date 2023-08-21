package pjhomework;

import java.util.ArrayList;


public class Student {
	private int studentId;    		
	private String studentName;		
	private Subject majorSubject;	
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	//addSubjectSocre() 메서드가 호출되면 리스트에 추가 됨

	
	public Student(int studentId, String studentName,  Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Subject getmajorSubject() {
		return majorSubject;
	}

	public void setmajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}


	public void addSubjectScore(Score score) {
		scoreList.add(score);
		
	}

	
	

}