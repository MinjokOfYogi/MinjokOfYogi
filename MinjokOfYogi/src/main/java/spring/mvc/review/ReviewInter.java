package spring.mvc.review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewInter extends JpaRepository<ReviewDto, Long> {

}
