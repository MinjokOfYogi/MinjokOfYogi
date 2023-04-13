package spring.mvc.minjok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"spring.mvc.test"})
public class MinjokOfYogiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinjokOfYogiApplication.class, args);
	}

}
