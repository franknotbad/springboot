package xyz.huanghongbo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xyz.huanghongbo.controller.HelloController;

public class HelloWorldControllerTest {
	@Test
    public void testSayHello() {
        assertEquals("Greetings from Spring Boot!",new HelloController().hello());
    }
}
