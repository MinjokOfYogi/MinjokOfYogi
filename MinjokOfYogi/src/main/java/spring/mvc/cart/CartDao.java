package spring.mvc.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

@Repository
public class CartDao {

	@Autowired
	CartInter cartInter;
	
	public void insertData(@ModelAttribute CartDto dto) {
		cartInter.save(dto);
		cartInter.findAll();
	}
}
