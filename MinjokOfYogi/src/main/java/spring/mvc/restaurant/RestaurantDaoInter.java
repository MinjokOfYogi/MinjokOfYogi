package spring.mvc.restaurant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantDaoInter extends JpaRepository<RestaurantDto, Long>{

	public List<RestaurantDto> findAllByOwnerId(Long ownerId);
}
