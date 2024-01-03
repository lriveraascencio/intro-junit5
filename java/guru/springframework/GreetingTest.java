package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	private Greeting greeting;
	
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

}
