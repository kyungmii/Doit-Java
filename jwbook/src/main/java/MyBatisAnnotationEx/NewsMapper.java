package MyBatisAnnotationEx;

import ch10.vo.NewsDO;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper 
public interface NewsMapper {
	
	@Insert("INSERT INTO news(title, img, date, content) "
			+ "VALUES(#{title}, #{img}, CURRENT_TIMESTAMP(), #{content})")
	public void addNews(NewsDO n);

	@Select("SELECT aid, title, " + "FORMATDATETIME(date, 'yyyy-MM-dd HH:mm:ss') AS cdate " + "FROM news")
	public List<NewsDO> getAll();

	@Select("SELECT aid, title, img, " + "FORMATDATETIME(date, 'yyyy-MM-dd HH:mm:ss') AS cdate, " + "content "
			+ "FROM news " + "WHERE aid=#{aid}")
	public NewsDO getNews(int aid);

	@Delete("DELETE FROM news WHERE aid=#{aid}")
	public void delNews(int aid);

}
