package spring.mvc.user;

import lombok.Data;

@Data
public class UserDto {
	
	private String USER_id;
	private String USER_pw;
	private String USER_hp;
	private String USER_addr;
	private int USER_point;
	private String USER_level;
	private String login_type;
}
