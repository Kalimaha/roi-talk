package blog.guidobarbaglia.roitalk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ConnectedEngineBTest {
    @Test
    fun `returns total value of stocks`() {
        assertThat(connectedEngineB("http://localhost:8080/stocks"))
            .isGreaterThan(100.0)
    }

    @Nested
    inner class WhenThereIsAProblem {
        @Test
        fun `returns total value of stocks`() {
            assertThat(connectedEngineB("http://localhost:9090/stocks"))
                    .isEqualTo(0.0)
        }
    }
}