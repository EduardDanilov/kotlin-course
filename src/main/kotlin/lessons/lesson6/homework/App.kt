package lessons.lesson6.homework

//fun example1(arg: String) {
//    // твой код и вывод результата через println()
//}

//fun example1(arg: Int) {
//    // твой код и вывод результата через println()
//}

//Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.

fun getCurrentSeason(seasonNumber: Int) {
    when (seasonNumber) {
        12, 1, 2 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        !in 1..12 -> println("Некорректное значение")
    }
}

//Задание 2: "Расчет возраста питомца"
//Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
//До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
//Результат распечатай в консоль.

fun getHumanAge(animalAge: Int) {
    when {
        animalAge in 0..2 -> println(animalAge * 10.5)
        animalAge > 2 -> println(animalAge * 4 + 13)
        else -> println("Ваш питомец еще не родился")
    }

}

//Задание 3: "Определение способа перемещения"
//Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
//Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun getBestTransport(distance: Int) {
    if (distance > 0 && distance < 1) {
        println("Пешком")
    } else if (distance >= 1 && distance < 5) {
        println("Велосипед")
    } else if (distance >= 5) {
        println("Автомобиль")
    } else {
        println("Улица идет к тебе")
    }
}

//Задание 4: "Расчет бонусных баллов"
//Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов:
//2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и
//3 балла за каждые 100 рублей при сумме свыше этого.

fun getDiscount(purchaseAmount: Int) {
    if (purchaseAmount > 0 && purchaseAmount < 1000) {
        println(purchaseAmount/100*2)
    } else if (purchaseAmount >= 1000) {
        println(purchaseAmount/100*3)
    } else {
        println("Сумма покупок не может быть 0 или отрицательным числом")
    }
}

//Задание 5: "Определение типа документа"
//В системе хранения документов каждый файл имеет расширение.
//Напишите функцию, которая на основе расширения файла печатает в консоль его тип:
//"Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun getDocType(fileExtension: String) {
    when (fileExtension) {
        "txt", "doc", "docx" -> println("Текстовый документ")
        "jpg", "png", "jpeg", "gif", "svg" -> println("Изображение")
        "xls", "xlsx" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

//Задание 6: "Конвертация температуры"
//Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
//в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
//Несколько аргументов передаются через запятую. Распечатай в консоль результат конвертации с добавлением единицы
//измерения. Чтобы добавить единицу измерения после результата используй функцию печати без переноса
//строки print("C") или print("F").

fun temperatureConverter(temperature: Int, measure: Char) {
    when (measure) {
        'F' -> println ("${(temperature - 32) * 5 / 9}C")
        'C' -> println("${(temperature * 9 / 5 + 32)}F")
    }
}

//Задание 7: "Подбор одежды по погоде"
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
//"куртка и шапка" при температуре ниже +10, "ветровка" от +10 до +18 градусов включительно и
//"футболка и шорты" при температуре выше +18 градусов.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun getClothByWeather(weatherTemperature: Int) {
    when {
        weatherTemperature >= -30 && weatherTemperature < 10 -> println("Куртка и шапка")
        weatherTemperature in 10..18 -> println("Ветровка и шорты")
        weatherTemperature > 18 && weatherTemperature <= 35-> println("Ветровка и шорты")
        weatherTemperature < -30 || weatherTemperature > +35 -> println("Не выходи из дома")
    }
}

//Задание 8: "Выбор фильма по возрасту"
//Кинотеатр предлагает фильмы разных возрастных категорий.
//Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов:
//"детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+" для остальных.
fun getFilmByViewerAge (currentViewerAge: Int) {
    when {
        currentViewerAge in 0..9 -> println("Детские")
        currentViewerAge in 10..18 -> println("Подростковые")
        currentViewerAge > 18 -> println("18+")
        else -> println("Отрицательный возраст?!")
    }
}

fun main() {
    getCurrentSeason(3)
    getHumanAge(100)
    getBestTransport(7)
    getDiscount(500)
    getDocType("txt")
    temperatureConverter(95, 'F')
    temperatureConverter(35, 'C')
    getClothByWeather(-30)
    getFilmByViewerAge(-5)
    getFilmByViewerAge(5)
    getFilmByViewerAge(14)
    getFilmByViewerAge(18)
    getFilmByViewerAge(60)
}