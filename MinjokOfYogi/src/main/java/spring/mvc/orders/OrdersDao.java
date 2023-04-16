package spring.mvc.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDao {

	@Autowired
	OrdersInter ordersInter;
}
