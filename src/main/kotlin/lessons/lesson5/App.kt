package lessons.lesson5

fun main() {
    val atmosphericPressureIndicator: Double? = 555.5
    val errorMessage: String = "Не хватает показателя атмосферного давления"
    val resultOfMeteorologicalMeasurements = atmosphericPressureIndicator ?: errorMessage

    println(resultOfMeteorologicalMeasurements)
}