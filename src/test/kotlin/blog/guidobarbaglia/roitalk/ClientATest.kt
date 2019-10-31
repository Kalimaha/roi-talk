package blog.guidobarbaglia.roitalk

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ClientATest {
    @Test
    fun `returns a list of stocks`() {
        Assertions.assertThat(clientA("http://localhost:8080/stocks")?.size).isEqualTo(3)
    }

    @Nested
    inner class WhenThereIsAProblem {
        @Test
        fun `returns a list of stocks`() {
            Assertions.assertThat(clientA("http://localhost:9090/stocks")).isNull()
        }
    }
}