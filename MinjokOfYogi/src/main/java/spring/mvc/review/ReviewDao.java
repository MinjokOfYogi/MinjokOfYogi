package spring.mvc.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDao {

	@Autowired
	ReviewInter ReviewInter;
	
	public List<ReviewDto> getAllReviews(){
		return ReviewInter.findAll();
	}
}
