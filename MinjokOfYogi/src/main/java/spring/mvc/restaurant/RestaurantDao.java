package spring.mvc.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDao {
	
	@Autowired
	RestaurantDaoInter rstInter;
	
	//insert
	public void insertRst(RestaurantDto dto) {
		rstInter.save(dto);
	}
}
