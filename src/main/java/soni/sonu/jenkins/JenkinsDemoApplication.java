package soni.sonu.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
