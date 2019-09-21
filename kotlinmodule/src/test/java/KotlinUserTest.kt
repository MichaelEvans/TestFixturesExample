import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinUserTest {
    @Test
    fun testManager() {
        assertEquals("Michael", TheOfficeFixtures.manager.firstName)
    }
}