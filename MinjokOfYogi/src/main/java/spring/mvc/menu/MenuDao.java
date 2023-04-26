package spring.mvc.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class MenuDao {

	@Autowired
	MenuDaoInter inter;
	
	//메뉴id에 해당하는 메뉴이름 구하기
	public MenuDto getMenuDatas(@RequestParam long mid) {
		return inter.findMenuByMid(mid);
	}
	
	//rid에 해당하는 식당이름 구하기
	public String getRname(@RequestParam long rid) {
		return inter.findRnameByRid(rid);
	}
	
}
