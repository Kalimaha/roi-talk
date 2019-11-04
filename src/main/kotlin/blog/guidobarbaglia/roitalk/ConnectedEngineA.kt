package blog.guidobarbaglia.roitalk

fun connectedEngineA(url: String): Double? =
    clientA(url)?.sumByDouble { it.price }
