import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void greetingsTest() {
        System.out.println("Testing the hello greeting :()");
        String actual = new Greetings().sayHello();
        String expected = "Hello";
        assertEquals(expected,actual);
    }
}
