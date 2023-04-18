package spring.mvc.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OwnerController {

	@GetMapping("/join")
	public String join() {
		return "join/join_register";
	}
	
	@GetMapping("/join/owner")
	public String ownerJoin() {
		return "owner/owner_register";
	}
	
	@PostMapping("/join/action")
	public String joinAction() {
		return "";
	}
	
}
