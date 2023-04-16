package spring.mvc.owner;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.restaurant.RestaurantDaoInter;
import spring.mvc.restaurant.RestaurantDto;


@Controller
public class OwnerController {

	@Autowired
	OwnerRegisterDao dao;
	
	@GetMapping("ownerjoin")
	public String form() {
		return "/owner/owner_register";
	}
	
	@PostMapping("addDB")
	public String insert(@ModelAttribute OwnerRegisterDto dto) {
		dao.insertOwner(dto);
		return "index";
	}
	
	@GetMapping("addmenu")
	public String menu() {
		return "/owner/addmenu";
	}
	
	@GetMapping("ownerlogin")
	public String ownerlogin() {
		return "/owner/owner_login";
	}
	@PostMapping(value = "/login-check")
	public ModelAndView ownerLogin(@ModelAttribute OwnerRegisterDto dto) {
		ModelAndView model=new ModelAndView();
		
		OwnerLoginDto loginDto = dao.selectData(dto);
		if(loginDto.getLoginok().equals("yes")) {
			model.addObject("ownerNumber", loginDto.getOwnId());
			model.addObject("ownerName", loginDto.getOwnName());
			model.setViewName("index");
			return model;
		}else {
			model.setViewName("/owner/owner_login");
			return model;
		}
		//getDataById() 해서 객체에 넣고 아이디 비밀번호 같은지 확인
		//확인 후 if else 문으로 return 반환
		
	}
	
	
}
