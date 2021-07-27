fun agoToText(secondsCount: Int): String {
    return when (secondsCount) {
        in 0 .. 60 -> "только что"
        in 60 .. 60*60 -> "${secondToMinutesToText(secondsCount)} назад"
        in 60 * 60 + 1 .. 24 * 60 * 60 -> "${secondToHoursToText(secondsCount)} назад"
        in 24 * 60 * 60 + 1 .. 24 * 60 * 60 * 2 -> "сегодня"
        in 24 * 60 * 60 * 2 + 1 .. 24 * 60 * 60 * 3 -> "вчера"
        else ->  {
            "давно"
        }
    }
}

fun secondToMinutesToText(secondsCount: Int): String {
    val minutesCount = secondsCount/60
    return when {
        (minutesCount % 10 == 1 && minutesCount !== 11) -> "$minutesCount минуту"
        (minutesCount % 10 == 2 || minutesCount % 10 == 3 || minutesCount % 10 == 4 ) -> "$minutesCount минуты"
        else -> {
            "$minutesCount минут"
        }
    }
}

fun secondToHoursToText(secondsCount: Int): String {
    val hoursCount = secondsCount/(60*60)
    return when {
        (hoursCount % 10 == 1 && hoursCount !== 11) -> "$hoursCount минуту"
        (hoursCount % 10 == 2 || hoursCount % 10 == 3 || hoursCount % 10 == 4 ) -> "$hoursCount минуты"
        else -> {
            "$hoursCount минут"
        }
    }
}

fun main() {
    val secondsCount = 39_600
    val result = agoToText(secondsCount)
    println("Был(а) в сети $result")
}