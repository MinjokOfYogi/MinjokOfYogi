package spring.mvc.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	@Id
	@Column
	private String USER_id;
	
	@Column
	private String USER_pw;
	
	@Column
	private String USER_hp;
	
	@Column
	private String USER_addr;
	
	@Column
	@Builder.Default
	private int USER_point=0;
	
	@Column
	@Builder.Default
	private String USER_level="아기돼지";
	
	@Column
	@Builder.Default
	private String login_type="user";
}
