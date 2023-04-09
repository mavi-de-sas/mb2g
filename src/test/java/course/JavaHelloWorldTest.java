package course;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        System.out.println("=====JUnit4");
        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}