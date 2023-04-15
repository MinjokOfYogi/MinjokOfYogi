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
			return "/user/user_mypage";

		} else {
			return "/user/user_loginfail";

		}
	}
}
