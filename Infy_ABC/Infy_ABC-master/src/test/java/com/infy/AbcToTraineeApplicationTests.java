package com.infy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbcToTraineeApplicationTests {

	@Test
	void contextLoads() {
		
		String s="Alphabets";
		String v= "Elements";
		if(!s.equals(v)) {
			System.out.println("Not equal");
		}
	}

}
