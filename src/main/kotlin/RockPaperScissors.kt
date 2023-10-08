import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    while (true) {
        val computerChoice = options[Random().nextInt(3)]
        println("Выберите ваш вариант: 1 - Камень, 2 - Ножницы, 3 - Бумага, 0 - Выход")
        val userChoice = when (scanner.nextInt()) {
            1 -> "Камень"
            2 -> "Ножницы"
            3 -> "Бумага"
            0 -> {
                println("Игра завершена.")
                return
            }
            else -> {
                println("Некорректный выбор. Попробуйте снова.")
                continue
            }
        }

        println("Ваш выбор: $userChoice")
        println("Выбор компьютера: $computerChoice")

        val result = when {
            userChoice == computerChoice -> "Ничья!"
            userChoice == "Камень" && computerChoice == "Ножницы" ||
                    userChoice == "Ножницы" && computerChoice == "Бумага" ||
                    userChoice == "Бумага" && computerChoice == "Камень" -> "Вы победили!"
            else -> "Компьютер победил!"
        }

        println(result)
    }
}