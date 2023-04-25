package spring.mvc.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.user.UserDto;

public interface ReviewInter extends JpaRepository<ReviewDto, Long> {
	
	public List<ReviewDto> findByUid(UserDto dto);

}
