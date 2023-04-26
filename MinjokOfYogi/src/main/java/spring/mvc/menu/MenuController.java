package spring.mvc.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@Autowired
	MenuDaoInter inter;
	
	@Autowired
	MenuDao dao;
	
	@GetMapping("/list/menu")
	public ModelAndView menu(@RequestParam long num) {
		
		ModelAndView model=new ModelAndView();

		//메뉴 전체 리스트
		List<MenuDto> list=inter.findAllByRid(num);
		model.addObject("list", list);
		
		//식당 이름 구하기
		String rname=dao.getRname(num);
		model.addObject("rname", rname);
		
		model.setViewName("owner/menu");
		return model;
	}
	
	@GetMapping("/list/menu/detail")
	public String cart(@RequestParam long num,
			Model model) {
		
		MenuDto dto=dao.getMenuDatas(num);
		model.addAttribute("dto", dto);
		
		return "cart/menudetail";
	}
}
