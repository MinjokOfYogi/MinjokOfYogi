package spring.mvc.minjok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"spring.mvc.*"})
@EnableJpaRepositories({"spring.mvc.*"}) //dao인식
@EntityScan({"spring.mvc.*"})
public class MinjokOfYogiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinjokOfYogiApplication.class, args);
	}

}
