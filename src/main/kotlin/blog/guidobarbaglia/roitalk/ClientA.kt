package blog.guidobarbaglia.roitalk

import org.springframework.web.client.ResourceAccessException
import org.springframework.web.client.RestTemplate

fun clientA(url: String): Array<Stock>? =
    try {
        RestTemplate().getForObject(url, Array<Stock>::class.java)
    } catch (e: ResourceAccessException) {
        println("Something went wrong: $e) }")
        null
    }
