package MyBatisAnnotationEx;

import ch10.vo.NewsDO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class NewsDAO {
	private SqlSessionFactory sessionFactory;

	public NewsDAO() {
		String resource = "mybatis-config.xml";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public void addNews(NewsDO n) {
		try (SqlSession session = sessionFactory.openSession()) {
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			mapper.addNews(n);
			session.commit();
		}
	}

	public List<NewsDO> getAll() {
		try (SqlSession session = sessionFactory.openSession()) {
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			return mapper.getAll();
		}
	}

	public NewsDO getNews(int aid) {
		try (SqlSession session = sessionFactory.openSession()) {
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			return mapper.getNews(aid);
		}
	}

	public void delNews(int aid) {
		try (SqlSession session = sessionFactory.openSession()) {
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			mapper.delNews(aid);
			session.commit();
		}
	}
}
