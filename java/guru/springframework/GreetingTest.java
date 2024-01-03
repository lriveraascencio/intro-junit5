package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before I am only called once!");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("In Before each...");
		greeting = new Greeting();
		
	}

	@Test
	void testHelloWorld() {
		
		System.out.println(greeting.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		
		System.out.println(greeting.helloWorld("Luis"));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("In After Each...");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("after I am only called once!");
	}

}
