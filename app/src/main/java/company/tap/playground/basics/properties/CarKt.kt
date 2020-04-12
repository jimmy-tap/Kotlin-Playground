package company.tap.kotlinexploring.basics.properties;

class CarKt (var model:String, val dieselEngine:Boolean) {

    // Public by defaults and have default getter and setter
    var color = "yellow"
    var color1: String = "yellow"
    var color2: String? = null
    lateinit var color3: String


    fun test() {

        //color2.contains("ll")

        color2!!.contains("ll")

        color2?.let {
            print(it)
        }

        if (::color3.isInitialized)
            print(color3)
        else
            color3 = "yellow"
    }


    val seatCount1 = 4 // Constant there is no setter
    private var seatCount2 = 4 // private there is no setter

}