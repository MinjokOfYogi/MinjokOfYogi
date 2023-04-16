package spring.mvc.pick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PickController {
	
	@Autowired
	PickDao dao;
}
