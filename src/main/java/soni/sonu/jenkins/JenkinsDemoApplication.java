package soni.sonu.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	private static Logger LOGGER= LoggerFactory.getLogger("JenkinsDemoApplication");
	
	
	@PostConstruct
	private void init() {
		LOGGER.info("Application Intialize");
	}
	
	public static void main(String[] args) {
		LOGGER.info("Application Started");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
