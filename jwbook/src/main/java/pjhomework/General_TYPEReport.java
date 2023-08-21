package pjhomework;

import java.util.ArrayList;

public class General_TYPEReport {

	School school = School.getInstance();
	public static final String Main = "수강생 학점\t\t\n"; 
	//t: 탭 n: 줄바꿈 
	public static final String Header = "이름  |  학번  |  필수과목  |  점수   \n ";
	public static final String Line = "---------------------------\n";

	public StringBuffer buffer = new StringBuffer();

	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();

		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();

		}
		return buffer.toString();
	}

	public void makeHeader(Subject subject) {
		buffer.append(General_TYPEReport.Line);
		buffer.append("\t" + subject.getSubjectName()+ "\t");
		buffer.append(General_TYPEReport.Main);
		buffer.append(General_TYPEReport.Header);
		buffer.append(General_TYPEReport.Line);
	}

	public void makeBody(Subject subject) {

		ArrayList<Student> studentList = subject.getStudentList();

		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append("|");
			buffer.append(student.getStudentId());
			buffer.append("|");
//			buffer.append(student.getMajorSubject().getSubjectName());
//			buffer.append("|");

			String majorSubjectName = student.getMajorSubject().getSubjectName() ; // 필수과목의 과목명 가져와서
			buffer.append(majorSubjectName); // 과목명 출력

			buffer.append("|");

			getScoreGrade(student, subject.getSubjectId()); // 학생별 해당과목 학점 계산

			buffer.append("\n");
			buffer.append(Line);

		}
	}

	public void getScoreGrade(Student student, int subjectId) {

		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();

		GradeEvaluation[] gradeEvaluation = { new General_TYPE(), new Required_TYPE()}; // 학점

		for (int i = 0; i < scoreList.size(); i++) { // 학생이 가진 점수들

			Score score = scoreList.get(i);
			String grade;

			if (score.getSubject().getSubjectId() == subjectId) { // 현재 학점을 산출할 과목
				int subjectGradeType = score.getSubject().getGradeType(); // 해당 과목의 학점 유형 가져오기

				if (subjectGradeType == Define.AB_TYPE) {
					grade = gradeEvaluation[Define.Required_TYPE].getGrade(score.getPoint());
				} else if (score.getSubject().getSubjectId() == majorId) { // 중점 과목인 경우
					grade = gradeEvaluation[Define.Required_TYPE].getGrade(score.getPoint()); // 필수 과목

				} else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); // 얘가 일반 과목

				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
				
				
			}
		}
	}

	public void makeFooter() {
		buffer.append("\n");
	}
}