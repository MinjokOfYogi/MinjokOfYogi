package spring.mvc.cart;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.mvc.user.UserDto;


@Controller
public class CartController {

	@Autowired
	CartDao dao;
	
	@GetMapping("/cartList")
	public String cartList() {
		
		return "cart/cart_list";
	}
	
	@PostMapping("/list/menu/insert")
	public String insertCart(@ModelAttribute CartDto dto,
			HttpSession session) {
		
		dao.insertData(dto);
		
		
		return "cart/cart_list";
	}
}
