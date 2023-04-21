package spring.mvc.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@Autowired
	MenuDaoInter inter;
	
	@GetMapping("/list/menu")
	public ModelAndView menu(@RequestParam long num) {
		
		ModelAndView model=new ModelAndView();

		List<MenuDto> list=inter.findAllByRid(num);
		model.addObject("list", list);
		
		model.setViewName("owner/menu");
		return model;
	}
}
