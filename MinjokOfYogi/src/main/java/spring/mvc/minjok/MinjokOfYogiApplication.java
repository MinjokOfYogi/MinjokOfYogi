package spring.mvc.minjok;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"spring.mvc.test","spring.mvc.user"})
@MapperScan("user")
public class MinjokOfYogiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinjokOfYogiApplication.class, args);
	}

}
