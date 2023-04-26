package spring.mvc.review;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.user.UserDao;

@Controller
public class ReviewController {
	
	@Autowired
	ReviewDao dao;
	
	@Autowired
	UserDao udao;

	@GetMapping("reviewList")
	public ModelAndView reviewList(HttpSession session) {
		ModelAndView mview=new ModelAndView();
		
		String loginUser = (String)session.getAttribute("loginUser");
		
		mview.addObject("list", dao.getAllReviewsById(udao.getUser(loginUser)));
		
		mview.setViewName("review/review_list");
		
		return mview;
	}
	
	@GetMapping("insertReviewForm")
	public ModelAndView insertReviewForm(@RequestParam long oid) {
		ModelAndView mview=new ModelAndView();
		
		mview.addObject("oid", oid);
		mview.setViewName("review/review_insertForm");
		
		return mview;
	}
	
	@PostMapping("insertReview")
	public String insertReview(@ModelAttribute ReviewDto dto) {
		
		dao.insert_review(dto); 
		
		return "redirect:reviewList";
	}
	
	
	@GetMapping("deleteReview")
	public String deleteReview(@RequestParam long rid) {
		
		dao.delete_review(rid);
		
		return "redirect:reviewList";
	}
	
	@GetMapping("getReview")
	public ModelAndView getReview(@RequestParam long rid) {
		ModelAndView mview=new ModelAndView();
		
		mview.addObject("dto", dao.getData(rid));
		mview.setViewName("review/review_updateForm");
		
		
		return mview;
	}
	
	@PostMapping("updateReview")
	public String updateReview(@ModelAttribute ReviewDto dto) {
		dao.insert_review(dto); 
		
		return "redirect:reviewList";
	}
	
}
