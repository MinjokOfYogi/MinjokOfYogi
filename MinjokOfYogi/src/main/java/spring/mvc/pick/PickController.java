package spring.mvc.pick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.user.UserDto;

@Controller
public class PickController {
	
	@Autowired
	PickDao dao;
	
	@GetMapping("pickList")
	public ModelAndView pickList(@RequestParam String loginUser) {
		ModelAndView mview=new ModelAndView();
		
		mview.addObject("count", dao.getPicksById(loginUser).size());
		mview.addObject("list", dao.getPicksById(loginUser));
		
		mview.setViewName("pick/pick_list");
		
		return mview;
	}
}
