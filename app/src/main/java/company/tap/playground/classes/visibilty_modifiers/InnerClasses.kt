@file:Suppress("unused")

package company.tap.playground.classes.visibilty_modifiers

class Outer {
    private var outerName = ""

    class Inner {
        fun changeName(newName: String) {
//            outerName = newName
        }
    }
}

class AnotherOuter {
    private var name = ""

    inner class Inner {
        fun changeName(newName: String) {
            name = newName
        }
    }
}
