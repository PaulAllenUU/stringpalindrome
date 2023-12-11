package loweconnex.com.stringpalindrome;

import org.hibernate.annotations.Comment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
		basePackages = {"loweconnex.com.stringpalindrome.repository"})
public class StringpalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringpalindromeApplication.class, args);
	}

}
