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
	public OwnerLoginDto selectData(OwnerRegisterDto dto) {
		//id랑 비밀번호 입력한거랑 db에 있는거랑 비교
		//프론트에서 받아온 데이터 : dto
		//db에서 가져올 데이터 : ownerData
		
		OwnerRegisterDto ownerData = ownerInter.findByOwnOwnerid(dto.getOwnOwnerid());
		OwnerLoginDto failDto = new OwnerLoginDto();
 
		if(ownerData==null) {
			failDto.setLoginok("no");
			return failDto;
		}
		
		if(dto.getOwnOwnerid().equals(ownerData.getOwnOwnerid()) && dto.getOwnPass().equals(ownerData.getOwnPass())) {
//			loginDto.setLoginok("yes");
//			loginDto.setOwnId(userData.getOwnId());
			OwnerLoginDto successDto = OwnerLoginDto.builder()
					.loginok("yes")
					.ownId(ownerData.getOwnId())
					.ownName(ownerData.getOwnName())
					.build();
			return successDto;
		}else {
			failDto.setLoginok("no");
			return failDto;
		}
//		System.out.println(userData);
	}
	
}

