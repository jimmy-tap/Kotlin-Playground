@file:Suppress("unused")

package company.tap.playground.classes.`object`

object Singleton : Any(), Runnable {
    override fun run() {

    }

    val name = "Singleton"

    fun className(): String = this.javaClass.simpleName
}

fun foo() {
    println(Singleton.name)
}