package blog.guidobarbaglia.roitalk


fun connectedEngineB(url: String): Double? =
    clientB(url)
        .getOrElse(emptyArray())
        ?.map { it.price }
        ?.foldRight(0.0) { a, b -> a + b }
