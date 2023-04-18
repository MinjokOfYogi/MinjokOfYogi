package spring.mvc.pick;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.user.UserDao;
import spring.mvc.user.UserDto;
import spring.mvc.user.UserInter;

@Repository
public class PickDao {

	@Autowired
	PickInter pickInter;
	
	@Autowired
	UserDao userDao;
	
	public List<PickDto> getPicksById(@RequestParam String loginUser) {
		UserDto dto= userDao.getUser(loginUser);
		
		return pickInter.findAllByUid(dto);
	};
}
