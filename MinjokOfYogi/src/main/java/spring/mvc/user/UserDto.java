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
import lombok.ToString;

@Entity
@Table(name = "USER")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
	
	@Id
	@Column(name = "USER_id")
	private String uid;
	
	@Column(name = "USER_pw")
	private String upw;
	
	@Column(name = "USER_hp")
	private String uhp;
	
	@Column(name = "USER_addr")
	private String uaddr;
	
	@Column(name = "USER_point")
	@Builder.Default
	private int upoint=0;
	
	@Column(name = "USER_level")
	@Builder.Default
	private String ulevel="아기돼지";
	
	@Column
	@Builder.Default
	private String login_type="user";
}
