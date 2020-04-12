package company.tap.kotlinexploring.basics.why_kotlin;

fun isEven(n: Int): Boolean {
    val even = if (n % 2 == 0)
        true
     else {
        false
    }

    return even
//    return n % 2 == 0 ? true : false
}