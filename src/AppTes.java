import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTes {
    @Test
    public void testAppHasAGreeting() {
        assertEquals("Hello, JAVA!", App.getGreeting());
    }

}