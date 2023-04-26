package spring.mvc.menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDaoInter extends JpaRepository<MenuDto, Long> {

	List<MenuDto> findAllByRid(long rid);

	@Query("SELECT r.rname FROM RestaurantDto r WHERE r.rid = :rid")
    String findRnameByRid(@Param("rid") Long rid);

	@Query("SELECT m FROM MenuDto m WHERE m.mid = :mid")
    MenuDto findMenuByMid(@Param("mid") Long mid);
}
