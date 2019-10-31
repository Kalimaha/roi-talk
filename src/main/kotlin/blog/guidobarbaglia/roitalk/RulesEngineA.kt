package blog.guidobarbaglia.roitalk


fun engineA(a: Int, b: Int, c: Int): Int =
    try {
        sum(1000, divide(c, subtract(a, b)))
    } catch (e: ArithmeticException) {
        42
    }

private fun subtract(a: Int, b: Int): Int = a - b

private fun divide(a: Int, b: Int): Int = a / b

private fun sum(a: Int, b: Int): Int = a + b