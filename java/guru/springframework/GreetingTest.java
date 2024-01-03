package guru.springframework;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void testHelloWorld() {
		Greeting greeting = new Greeting();
		System.out.println(greeting.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		Greeting greeting = new Greeting();
		System.out.println(greeting.helloWorld("Luis"));
	}

}
