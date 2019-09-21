import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTests {

    @Test
    public void testFixturesFromJava() {
        assertEquals("Walter", BreakingBadFixtures.heisenberg().getFirstName());
    }

    @Test
    public void testFixturesFromKotlin() {
        assertEquals("Dwight", TheOfficeFixtures.Companion.getAssistantToTheRegionalManager().getFirstName());
    }
}
