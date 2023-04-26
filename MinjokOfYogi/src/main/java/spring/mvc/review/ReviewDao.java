package spring.mvc.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.user.UserDto;

@Repository
public class ReviewDao {

	@Autowired
	ReviewInter ReviewInter;
	
	public List<ReviewDto> getAllReviewsById(@RequestParam UserDto dto){
		return ReviewInter.findByUid(dto);
	}
	
	public void insert_review(ReviewDto dto) {
		ReviewInter.save(dto);
	}
	
	public void delete_review(long rid) {
		ReviewInter.deleteById(rid);
	}
	
	public ReviewDto getData(long rid) {
		return ReviewInter.getReferenceById(rid);
	}

}
