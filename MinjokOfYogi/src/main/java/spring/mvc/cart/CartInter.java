package spring.mvc.cart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartInter extends JpaRepository<CartDto, Long> {

}
