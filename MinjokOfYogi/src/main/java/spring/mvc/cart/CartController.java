package spring.mvc.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@Autowired
	CartDao dao;
	
	@GetMapping("cartList")
	public ModelAndView cartList() {
		ModelAndView mview=new ModelAndView();
		
		mview.setViewName("cart/cart_list");
		return mview;
	}
	
}
