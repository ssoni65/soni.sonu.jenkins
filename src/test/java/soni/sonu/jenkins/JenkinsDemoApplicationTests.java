package soni.sonu.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	private static Logger LOGGER= LoggerFactory.getLogger("JenkinsDemoApplication");
	
	@Test
	void contextLoads() {
		LOGGER.info("Test Case Executed");
		LOGGER.info("Test Case Executed- 2nd Log");

		assertEquals(true, true);
	}

}
