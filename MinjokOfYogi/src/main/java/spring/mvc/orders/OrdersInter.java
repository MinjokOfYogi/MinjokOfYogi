package spring.mvc.orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersInter extends JpaRepository<OrdersDto, Long> {

}
