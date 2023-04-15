package spring.mvc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	UserInter userInter;
	
	public void join_user(UserDto dto) {
		userInter.save(dto);
	}
	
	public UserDto getUser(String id) {
		return userInter.getReferenceById(id);
	}
}
