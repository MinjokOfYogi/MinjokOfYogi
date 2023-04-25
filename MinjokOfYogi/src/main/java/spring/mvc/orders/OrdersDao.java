package spring.mvc.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.user.UserDao;
import spring.mvc.user.UserDto;

@Repository
public class OrdersDao {

	@Autowired
	OrdersInter ordersInter;
	
	@Autowired
	UserDao userDao;
	
	public List<OrdersDto> getOrderById(String loginUser){
		UserDto dto=userDao.getUser(loginUser);

		return ordersInter.findAllByUid(dto);
	}
	public void deleteOrder(long oid) {
		ordersInter.deleteById(oid);
	}
	
}
