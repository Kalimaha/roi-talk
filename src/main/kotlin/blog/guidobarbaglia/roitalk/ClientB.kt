package blog.guidobarbaglia.roitalk

import io.vavr.control.Either
import io.vavr.control.Try
import org.springframework.web.client.RestTemplate

fun clientB(url: String): Either<Throwable, Array<Stock>?> =
    Try.of { RestTemplate().getForObject(url, Array<Stock>::class.java) }
        .onFailure { println("Something went wrong: $it) }") }
        .toEither()
