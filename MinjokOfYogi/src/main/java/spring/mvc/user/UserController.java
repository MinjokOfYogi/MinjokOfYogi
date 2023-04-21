package spring.mvc.user;

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
	public String login_user(@RequestParam String uid, @RequestParam String upw, HttpSession session) {
		UserDto dto = dao.getUser(uid);

		if (dto == null)
			return "/user/user_loginfail";
		else if (dto.getUid().equals(uid) && dto.getUpw().equals(upw)) {
			session.setAttribute("loginUser", uid);
			return "redirect:/";

		} else {
			return "/user/user_loginfail";

		}
	}
	
	@GetMapping("logout")
	public String logout_user(HttpSession session) {
		session.removeAttribute("loginUser");
		return "redirect:/";
	}
	
	@GetMapping("mypage")
	public ModelAndView myPage(HttpSession session) {
		ModelAndView mview=new ModelAndView();
		String loginUser=(String)session.getAttribute("loginUser");
		
		UserDto dto=dao.getUser(loginUser);
		mview.addObject("dto", dto);
		
		mview.setViewName("/user/user_mypage");
		
		return mview;
	}
	
	
}
