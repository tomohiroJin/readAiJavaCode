import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.message());
    }
}
