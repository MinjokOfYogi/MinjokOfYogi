package spring.mvc.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class UserDao {

	@Autowired
	private SqlSession session;
	
	public void join_user(UserDto dto) {
		session.insert("insert_user",dto);
	}
}
