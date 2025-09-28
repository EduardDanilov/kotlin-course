package lessons.lesson7.homework

fun main() {
    println("Task 1. Прямой диапазон")
    println("Напишите цикл for, который выводит числа от 1 до 5.")

    for (i in 1..5) {
        println(i)
    }

    println("\n")
    println("Напишите цикл for, который выводит четные числа от 1 до 10")

    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    println("\n")
    println("Task 2. Обратный диапазон")
    println("Создайте цикл for, который выводит числа от 5 до 1.")

    for (i in 5 downTo 1) {
        println(i)
    }

    println("\n")
    println("Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.")

    for (i in 10 downTo 1) {
        println(i-2)
    }

    println("\n")
    println("Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.")

    for (i in 1..9 step 2) {
        println(i)
    }

    println("\n")
    println("Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.")

    for (i in 1..20 step 3) {
        println(i)
    }

    println("\n")
    println("Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.")

    val size: Short = 18
    for (i in 3 until size step 2) {
        println(i)
    }

    println("\n")
    println("Task 3. Задания для цикла while")
    println("Создайте цикл while, который выводит квадраты чисел от 1 до 5.")

    var squareStarter: Short = 1
    val squareLimiter: Short = 5
    while (squareStarter <= squareLimiter) {
        println(squareStarter * squareStarter)
        squareStarter++
    }

    println("\n")
    println("Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")

    var startNumber: Short = 10
    var finishNumber: Short = 5
    while (startNumber >= finishNumber) {
        println(startNumber)
        startNumber--
    }

    println("\n")
    println("Используйте цикл do while, чтобы вывести числа от 5 до 1.")
    startNumber = 5
    finishNumber = 1
    do {
        println(startNumber)
        startNumber--
    } while (startNumber >= finishNumber)

    println("\n")
    println("Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.")

    finishNumber = 10
    do {
        println(startNumber)
        startNumber++
    } while (startNumber < finishNumber)

    println("\n")
    println("Task 4. Задания для прерывания и пропуска итерации")
    println("Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.")

    startNumber = 1
    finishNumber = 10
    for (i in startNumber..finishNumber) {
        println(i)
        if (i == 6) break
    }

    println("\n")
    println("Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.")

    while (true) {
        println(startNumber)
        if (startNumber.toInt() == 10) break
        startNumber++
    }

    println("\n")
    println("В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.")

    for (i in 1..10) {
        if (i % 2 != 0) {
            println(i)
        } else continue
    }

    println("\n")
    println("Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.")

    startNumber = 1
    finishNumber = 10
    while (startNumber <= finishNumber) {
        if (startNumber % 3 != 0) {
            println(startNumber)
            startNumber++
        } else
            startNumber++
            continue
    }

    println("\n")
    println("Доп задания")
    println("Используя вложенный цикл реализовать таблицу умножения, как на картинке")
    var row: String = ""
    for (i in 1..10) {
        for (j in 1..10) {
            row += (i*j).toString() + " "
        }
        row += "\n"
    }
    println(row)

    println("\n")

    println("Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.")
    fun summinator (arg: Int) {
        var result: Int = 0
        for (i in 1..arg) {
            result += i
        }
        println(result)
    }
    summinator(10)

    println("\n")

    println("Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.")
    fun factorial(arg: Int) {
        var result: Int = 1
        var counter = 1
        while (counter <= arg) {
            result *= counter
            counter++
        }
        println(result)
    }

    factorial(5)

    println("\n")
    println("Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.")

    fun sumAllEvenNumbers (arg: Int) {
        var result: Int = 0
        for (i in 0..arg) {
            if (i % 2 == 0) {
                result += i
            } else continue
        }
        println(result)
    }

    println("/n")
    println("Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5х3 из *")

    fun pryamougolnik() {
        var i: Int = 0
        val symbol: String = "*"
        var result: String = ""
        while (i < 3) {
            var j: Int = 0
            while (j < 5) {
                result += symbol
                j++
            }
            result += "\n"
            i++
        }
        println(result)
    }
    pryamougolnik()

    println("/n")
    println("Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.")

    fun sumOfEvenAndOddNumbers(arg: Int) {
        var evenNumbers: Int = 0
        var oddNumbers: Int = 0
        for (i in 1..arg) {
            if (i % 2 == 0) {
                evenNumbers += i
            } else {
                oddNumbers += i
            }
        }

        println(evenNumbers + oddNumbers)
    }
    sumOfEvenAndOddNumbers(3)
}
