package spring.mvc.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class MenuDao {

	@Autowired
	MenuDaoInter inter;
	
}
