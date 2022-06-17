package pl.edu.wszib.jwdworkingtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class JwdWorkingtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwdWorkingtimeApplication.class, args);
	}

}
