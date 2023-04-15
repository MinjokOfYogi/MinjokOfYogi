package spring.mvc.owner;

import java.util.List;
import java.util.Optional;

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
	public List<OwnerRegisterDto> getAllDatas(){
		return ownerInter.findAll();
	}
	/*
	 * public OwnerRegisterDto getDataById() { return ownerInter.findByOwnOwnerId();
	 * //ownerid로 데이터를 가져오기 }
	 */
	//select
	public String selectData(OwnerRegisterDto dto) {
		//id랑 비밀번호 입력한거랑 db에 있는거랑 비교
		//프론트에서 받아온 데이터 : dto
		//db에서 가져올 데이터 : userData
		
		OwnerRegisterDto userData = ownerInter.findByOwnOwnerid(dto.getOwnOwnerid());
		if(userData==null) {
			String loginok="no";
			return loginok;
		}
		
		if(dto.getOwnOwnerid().equals(userData.getOwnOwnerid()) && dto.getOwnPass().equals(userData.getOwnPass())) {
			String loginok="yes";
			return loginok;
		}else {
			String loginok="no";
			return loginok;
		}
//		System.out.println(userData);
	}
}

