package spring.mvc.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {
	
	@Autowired
	ReviewDao dao;

	@GetMapping("reviewList")
	public ModelAndView reviewList() {
		ModelAndView mview=new ModelAndView();
		
		mview.addObject("list", dao.getAllReviews());
		
		mview.setViewName("review/review_list");
		
		return mview;
	}
	
	@GetMapping("insertReview")
	public String insertReview() {
		
		return "review/review_insertForm";
	}
	
}
