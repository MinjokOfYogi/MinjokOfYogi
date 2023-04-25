package spring.mvc.orders;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.user.UserDao;

@Controller
public class OrdersController {

	@Autowired
	OrdersDao dao;
	
	@Autowired
	UserDao udao;

	@GetMapping("ordersList")
	public ModelAndView ordersList(HttpSession session) {
		ModelAndView mview=new ModelAndView();
		String loginUser=(String)session.getAttribute("loginUser");
		mview.addObject("count", dao.getOrderById(loginUser).size());
		mview.addObject("olist", dao.getOrderById(loginUser));
		mview.setViewName("orders/orders_list");
		return mview;
	}
	@GetMapping("delete")
	public String delete(long oid) {
		dao.deleteOrder(oid);
		return "redirect:ordersList";
	}

}
