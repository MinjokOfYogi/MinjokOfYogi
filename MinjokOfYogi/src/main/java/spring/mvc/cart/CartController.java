package spring.mvc.cart;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@Autowired
	CartDao dao;
	
	@GetMapping("/cartList")
	public String cartList() {
		
		mview.setViewName("cart/cart_list");
		return mview;
	}
	
	@PostMapping("/list/menu/insert")
	public String insertCart(@ModelAttribute CartDto dto,
			HttpSession session) {
		
		dao.insertData(dto);
		
		
		return "cart/cart_list";
	}
}
