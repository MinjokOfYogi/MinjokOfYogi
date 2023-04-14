package spring.mvc.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRegisterDao {

	@Autowired
	OwnerRegisterDaoInter ownerInter;
	
	//insert
	public void insertOwner(OwnerRegisterDto dto) {
		ownerInter.save(dto);
	}
}
