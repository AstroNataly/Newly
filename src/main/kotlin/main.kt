fun main() {

    val result = agoToText(6500)
    println("Был(а) в сети $result")
}

fun agoToText(secondsCount: Int): String {
    return when {
        (0 <= secondsCount && secondsCount <= 60) -> "только что"
        (60 <= secondsCount && secondsCount <= 60*60) -> "x минут назад" //вместо х вызов дополнительной функции
        (60 * 60 + 1 <= secondsCount && secondsCount <= 24 * 60 * 60) -> "x часов назад" //вместо х вызов дополнительной функции
        (24 * 60 * 60 + 1 <= secondsCount && secondsCount <= 24 * 60 * 60 * 2) -> "сегодня"
        (24 * 60 * 60 * 2 + 1 <= secondsCount && secondsCount <= 24 * 60 * 60 * 3) -> "вчера"
        else ->  {
            "давно"
        }
    }
}

