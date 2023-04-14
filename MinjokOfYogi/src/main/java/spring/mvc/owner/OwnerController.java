package spring.mvc.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	@GetMapping("ownerlogin")
	public String ownerlogin() {
		return "/owner/owner_login";
	}
	@PostMapping("manage")
	public String manage() {
		return "/owner/managepage";
	}
	
	
}
