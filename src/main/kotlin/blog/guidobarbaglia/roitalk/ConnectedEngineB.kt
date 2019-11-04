package blog.guidobarbaglia.roitalk

import io.vavr.control.Either


fun connectedEngineB(url: String): Double? =
    clientB(url)
        .flatMap { sum(it) }
        .getOrElse(0.0)

private fun sum(l: Array<Stock>?): Either<Throwable, Double> =
    Either.right(l?.sumByDouble { it.price })