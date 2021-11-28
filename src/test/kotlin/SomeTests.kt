import org.junit.jupiter.api.assertAll
import kotlin.test.Test
import kotlin.test.assertEquals

class SomeTests {
    @Test
    fun someTest() {
        // doesn't generate <Click to see the difference> for some reason
        assertAll({ assertEquals("123", "23") }, { error("Some illegal state") })
    }

    @Test
    fun someTest1() {
        // generates <Click to see the difference>
        assertEquals("123", "23")
    }

    @Test
    fun someTest2() {
        // generates <Click to see the difference>
        assertAll({ assertEquals("123", "23") }, { assertEquals("234", "345") })
    }

    @Test
    fun someTest3() {
        // doesn't generate <Click to see the difference> for some reason
        assertAll({ assertEquals("123", "23") }, { throw IllegalArgumentException("234") })
    }
}