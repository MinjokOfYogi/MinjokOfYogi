package spring.mvc.pick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PickController {
	
	@Autowired
	PickDao dao;
	
	@GetMapping("pickList")
	public String pickList() {
		
		return "pick/pick_list";
	}
}
