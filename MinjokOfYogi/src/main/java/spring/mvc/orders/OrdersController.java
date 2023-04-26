package spring.mvc.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrdersController {

	@Autowired
	OrdersDao dao;

	@GetMapping("ordersList")
	public ModelAndView ordersList(String loginUser) {
		ModelAndView mview=new ModelAndView();
		
		mview.addObject("count", dao.getOrderById(loginUser).size());
		mview.addObject("olist", dao.getOrderById(loginUser));
		mview.setViewName("orders/orders_list");
		return mview;
	}

}
