@file:Suppress("unused")

package company.tap.playground.classes.interfaces

interface Stoppable : Drivable {
    fun stop() = println("I'm stopping")
}

class StoppableCar : Stoppable {
    override fun drive() {
        println("I'm driving")
    }
}