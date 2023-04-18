package spring.mvc.pick;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.user.UserDto;

public interface PickInter extends JpaRepository<PickDto, Long>{

	List<PickDto> findAllByUid(UserDto dto);
	

}
