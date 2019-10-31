package blog.guidobarbaglia.roitalk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ClientBTest {
    @Test
    fun `returns a list of stocks`() {
        assertThat(clientB("http://localhost:8080/stocks").get()?.size)
            .isEqualTo(3)
    }

    @Nested
    inner class WhenThereIsAProblem {
        @Test
        fun `returns a list of stocks`() {
            assertThat(clientB("http://localhost:9090/stocks").left.message)
                .contains("Connection refused")
        }
    }
}