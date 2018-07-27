package xyz.huanghongbo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xyz.huanghongbo.Controller.NewUserCtrl;;

public class HelloWorldControllerTest {
	@Test
    public void testSayHello() {
        assertEquals(1,new NewUserCtrl().getUserByName("yiibai"));
    }
}
