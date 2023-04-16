package spring.mvc.pick;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PickInter extends JpaRepository<PickDto, Long>{

}
