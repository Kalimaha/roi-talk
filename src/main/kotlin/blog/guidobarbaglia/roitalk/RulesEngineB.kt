package blog.guidobarbaglia.roitalk

import io.vavr.control.Either

fun engineB(a: Int, b: Int, c: Int): Int =
    subtract(a, b)
        .flatMap { divide(c, it) }
        .flatMap { sum(it, 1000) }
        .getOrElse(42)

private fun subtract(a: Int, b: Int): Either<String, Int> =
    Either.right(a - b)

private fun divide(a: Int, b: Int): Either<String, Int> =
    if (b != 0) Either.right(a / b) else Either.left("B is zero!")

private fun sum(a: Int, b: Int): Either<String, Int> =
    Either.right(a + b)
