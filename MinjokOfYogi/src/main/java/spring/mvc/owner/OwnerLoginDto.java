package spring.mvc.owner;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//
//@Getter
//@Setter
//public class OwnerLoginDto extends OwnerRegisterDto{
//
//	private String loginok;
//}

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OwnerLoginDto {
	private long ownId;
	private String ownOwnerid;
	private String ownPass;
	private String ownName;
	private String ownPhone;
	private String loginok;
	
	
}