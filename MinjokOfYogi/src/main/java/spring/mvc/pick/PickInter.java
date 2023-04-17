package spring.mvc.pick;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PickInter extends JpaRepository<PickDto, Long>{

	List<PickDto> findAllById(String uid);
	

}
