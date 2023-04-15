package spring.mvc.owner;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OwnerController {

	@Autowired
	OwnerRegisterDao dao;
	private HttpSession session;
	
	@GetMapping("ownerjoin")
	public String form() {
		return "/owner/owner_register";
	}
	
	@PostMapping("addDB")
	public String insert(@ModelAttribute OwnerRegisterDto dto) {
		dao.insertOwner(dto);
		return "index";
	}
	@GetMapping("ownerlogin")
	public String ownerlogin() {
		return "/owner/owner_login";
	}
	@PostMapping("manage")
	public String manage() {
		return "/owner/managepage";
	}
	@GetMapping("managelist")
	public ModelAndView list() {
		ModelAndView model=new ModelAndView();
		List<OwnerRegisterDto> list=dao.getAllDatas();
		
		model.addObject("list", list);
		model.addObject("count", list.size());
		model.setViewName("list");
		return model;
	}
	@PostMapping(value = "/login-check")
	public String ownerLogin(@ModelAttribute OwnerRegisterDto dto) {
		String loginok = dao.selectData(dto);
		
		if(loginok=="yes") {
			return "/owner/managepage";
		}else {
			return "/owner/owner_login";
			
		}
		//getDataById() 해서 객체에 넣고 아이디 비밀번호 같은지 확인
		//확인 후 if else 문으로 return 반환
		
		
		
		
	}
	
	
}
