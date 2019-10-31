package blog.guidobarbaglia.roitalk

fun connectedEngineA(url: String): Double? {
    val tmp = clientA(url)

    return tmp?.map { it.price }?.foldRight(0.0) { a, b -> a + b } ?: 0.0
}
