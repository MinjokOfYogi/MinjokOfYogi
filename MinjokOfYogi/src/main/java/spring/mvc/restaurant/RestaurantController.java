package spring.mvc.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.owner.OwnerRegisterDto;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantDaoInter rstInter;
	@Autowired
	RestaurantDao dao;
	
	/*
	 * @GetMapping("addRestaurant") public String form() { return
	 * "/owner/addrestaurant"; }
	 */
	@GetMapping("addRestaurant")
	public ModelAndView addrst(@RequestParam Long num) {
		ModelAndView model = new ModelAndView();
		
		model.addObject("num", num);
		model.setViewName("/owner/addrestaurant");
		return model;
	}
	
	@GetMapping("manage")
	public ModelAndView manage(@RequestParam Long num) {
		ModelAndView model = new ModelAndView();
		//num을 가지고 restaurantdaointer에서 만든 함수를 불러와야함
		
		List<RestaurantDto> list = rstInter.findAllByOwnerId(num);
		model.addObject("ownerNumber",num);
		model.addObject("list", list);
		model.addObject("listCount",list.size());
		model.setViewName("/owner/managepage");
		return model;
	}
	
	@PostMapping("addRst")
	public String add(@ModelAttribute RestaurantDto dto) {
		dao.insertRst(dto);
		return "/owner/managepage";
	}
	
}
