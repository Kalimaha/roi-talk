package blog.guidobarbaglia.roitalk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RulesEngineATest {
    @Test
    fun `divides C by the difference between A and B`() {
        assertThat(engineA(7, 3, 100)).isEqualTo(1025)
    }

    @Nested
    inner class DivisionByZeroTest {
        @Test
        fun `returns a default value`() {
            assertThat(engineA(7, 7, 100)).isEqualTo(42)
        }
    }
}