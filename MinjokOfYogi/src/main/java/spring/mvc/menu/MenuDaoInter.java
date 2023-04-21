package spring.mvc.menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDaoInter extends JpaRepository<MenuDto, Long> {

	List<MenuDto> findAllByRid(long rid);

	
}
