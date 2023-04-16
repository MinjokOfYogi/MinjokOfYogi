package spring.mvc.user;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserDao dao;

	@GetMapping("/join/user")
	public String registform() {
		return "/user/user_join";
	}

	@PostMapping("/join/user_insert")
	public String insert_user(@ModelAttribute UserDto dto) {
		dao.join_user(dto);

		return "redirect:/";
	}

	@PostMapping("login")
	public String login_user(@RequestParam String id, @RequestParam String pw, HttpSession session) {
		UserDto dto = dao.getUser(id);

		if (dto == null)
			return "/user/user_loginfail";
		else if (dto.getId().equals(id) && dto.getPw().equals(pw)) {
			session.setAttribute("id", id);
			return "redirect:/";

		} else {
			return "/user/user_loginfail";

		}
	}
	
	@GetMapping("logout")
	public String logout_user(HttpSession session) {
		session.removeAttribute("id");
		return "redirect:/";
	}
	
	@GetMapping("mypage")
	public ModelAndView myPage(HttpSession session) {
		ModelAndView mview=new ModelAndView();
		String id=(String)session.getAttribute("id");
		
		UserDto dto=dao.getUser(id);
		mview.addObject("dto", dto);
		
		mview.setViewName("/user/user_mypage");
		
		return mview;
	}
	
	@GetMapping("cartList")
	public String cartList() {
		
		return "cart/cart_list";
	}
	
	@GetMapping("pickList")
	public String pickList() {
		
		return "pick/pick_list";
	}
	
	@GetMapping("reviewList")
	public String reviewList() {
		
		return "review/review_list";
	}
	
	@GetMapping("orderList")
	public String orderList() {
		
		return "order/order_list";
	}
}
