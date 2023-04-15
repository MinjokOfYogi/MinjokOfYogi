package spring.mvc.owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRegisterDaoInter extends JpaRepository<OwnerRegisterDto, String>{
	
	public OwnerRegisterDto findByOwnOwnerid(String OWN_ownerid); //own_ownerid가 같은 데이터를 반환하는 function을 만든것이다.
}
