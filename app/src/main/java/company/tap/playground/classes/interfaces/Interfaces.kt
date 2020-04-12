@file:Suppress("unused")

package company.tap.playground.classes.interfaces

interface Drivable {
    fun drive()
}

class DrivableCar : Drivable {

    override fun drive() {
        println("I'm driving")
    }
}

interface Steerable {
    fun steer()
}

class DrivableSteerableCar : Drivable, Steerable {

    override fun steer() {
        println("I'm steering")
    }

    override fun drive() {
        println("I'm driving")
    }
}