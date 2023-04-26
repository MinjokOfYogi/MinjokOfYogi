package spring.mvc.orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.mvc.user.UserDto;

public interface OrdersInter extends JpaRepository<OrdersDto, Long> {
	
	List<OrdersDto> findAllByUid(UserDto dto);
	
	
}
