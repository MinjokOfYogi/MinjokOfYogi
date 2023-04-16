package spring.mvc.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

	@Autowired
	CartDao dao;
	
	@GetMapping("cartList")
	public String cartList() {
		
		return "cart/cart_list";
	}
}
