package com.pipline.workflows;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WorkflowsApplicationTests {
	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testPipeline() {
		System.out.println("first test");
		assertTrue(true);
	}
}
