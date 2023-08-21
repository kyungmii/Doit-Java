package ch09;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

;
//데이터베이스 연결 을 위한 dao클래스 
public class StudentDAO {
	String resource = "ch09/mybatis-config.xml";
	InputStream inputStream ;
	SqlSessionFactory sqlSessionFactory ;
	
	public StudentDAO() {
		//InputStream inputStream = Resources.getResourceAsStream(resource);
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void insert(Student s) {
		try (SqlSession session = sqlSessionFactory.openSession()) {
		      StudentMapper mapper = session.getMapper(StudentMapper.class);
		     mapper.insertStudent(s); 
		     session.commit();
		    }
		}

	public List<Student> getAll() {
	    List<Student> students = new ArrayList<>();
	    try (SqlSession session = sqlSessionFactory.openSession()) {
	      StudentMapper mapper = session.getMapper(StudentMapper.class);
	      students = mapper.getStudents();
	    }
	    return students;
	  }
	}