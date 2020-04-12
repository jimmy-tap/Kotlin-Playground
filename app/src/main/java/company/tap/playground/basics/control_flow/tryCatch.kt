package company.tap.kotlinexploring.basics.why_kotlin;

import java.io.InputStream


fun divideWithZero(n: Int) {
    try {
        val fail = n / 0
    } catch (e: Exception) {
        //exception caught
    } finally {

    }
}

// No Checked Exception
fun openStream(stream: InputStream) {
    stream.close()
}

