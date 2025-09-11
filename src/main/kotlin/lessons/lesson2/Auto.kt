package lessons.lesson2

const val wheels: Int = 4

class Auto {
    val vinCode: String = "BXY2765JM72643"
    val color: String = "red"
    var mileage: Int = 0

    lateinit var ownerName: String

    val utilReport: Any by lazy {
        object {
            val vinCode = this@Auto.vinCode
            val color = this@Auto.color
            val mileage = this@Auto.mileage

            override fun toString(): String {
                return "Car report: \n-ownerName: $ownerName, \n-vinCode: $vinCode, \n-color: $color, \n-mileage: $mileage"
            }
        }
    }
}