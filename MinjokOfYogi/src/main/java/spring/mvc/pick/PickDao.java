package spring.mvc.pick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PickDao {

	@Autowired
	PickInter pickInter;
}
