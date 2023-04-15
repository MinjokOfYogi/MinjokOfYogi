package spring.mvc.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInter extends JpaRepository<UserDto, String> {

}
