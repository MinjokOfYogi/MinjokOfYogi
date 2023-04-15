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
	@Column(name = "USER_id")
	private String id;
	
	@Column(name = "USER_pw")
	private String pw;
	
	@Column(name = "USER_hp")
	private String hp;
	
	@Column(name = "USER_addr")
	private String addr;
	
	@Column(name = "USER_point")
	@Builder.Default
	private int point=0;
	
	@Column(name = "USER_level")
	@Builder.Default
	private String level="아기돼지";
	
	@Column
	@Builder.Default
	private String login_type="user";
}
