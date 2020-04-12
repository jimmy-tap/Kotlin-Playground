@file:Suppress("unused", "RemoveEmptyClassBody")

package company.tap.playground.classes.constructors

import java.util.*

class Person(val name: String) {

    var isRetired = false

    constructor(name: String, birthYear: Int) : this(name) {
        isRetired = birthYear <= Calendar.getInstance().get(Calendar.YEAR) - 65
    }
}