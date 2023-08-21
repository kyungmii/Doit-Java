package MyBatisAnnotationEx;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Student {
	private int id;
	private String username;
	private String univ;
	private Date birth;
	private String email;
}
