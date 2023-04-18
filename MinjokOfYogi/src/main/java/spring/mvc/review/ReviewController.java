package spring.mvc.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
	
	@Autowired
	ReviewDao dao;

	@GetMapping("reviewList")
	public String reviewList() {
		
		return "review/review_list";
	}
	
}
