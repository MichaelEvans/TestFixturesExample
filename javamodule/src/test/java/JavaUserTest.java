import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaUserTest {

    @Test
    public void testWalter() {
        assertEquals("Saul", BreakingBadFixtures.lawyer().getFirstName());
    }
}
