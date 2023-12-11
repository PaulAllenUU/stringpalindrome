package loweconnex.com.stringpalindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StringpalindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringpalindromeApplication.class, args);
	}

}
