package blog.guidobarbaglia.roitalk

import io.vavr.control.Either
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PippoTest {
  fun divide(a: Double, b: Double): Double? =
      if (b == 0.0) { null } else { a / b }

  fun optionalDivide(a: Double, b: Double): Either<String, Double> =
      if (b == 0.0) { Either.left("Division by zero.") } else { Either.right(a / b) }

  @Test
  fun testA() {
    assertThat(divide(4.0, 2.0)).isEqualTo(2.0)
  }

  @Test
  fun testB() {
    assertThat(divide(4.0, 0.0)).isNull()
  }

  @Test
  fun testC() {
    assertThat(optionalDivide(4.0, 2.0).get()).isEqualTo(2.0)
  }

  @Test
  fun testD() {
    assertThat(optionalDivide(4.0, 0.0).left).isEqualTo("Division by zero.")
  }
}