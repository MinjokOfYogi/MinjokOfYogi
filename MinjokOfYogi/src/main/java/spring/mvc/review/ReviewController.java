package spring.mvc.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public abstract class ReviewController {
	
	@Autowired
	ReviewDao dao;

}
