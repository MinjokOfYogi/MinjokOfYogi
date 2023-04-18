package spring.mvc.pick;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class PickDao {

	@Autowired
	PickInter pickInter;
	
	public List<PickDto> getPicksById(@RequestParam String uid) {
		return pickInter.findAll();
	};
}
