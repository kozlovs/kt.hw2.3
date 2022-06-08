fun main() {
    val buyer = Buyer(true)
    var sum = 1_000_45 //в копейках

    println("Сумма покупки составляет: ${sumToString(sum)} →")
    val standartSale = 100_00
    val discountOver1000 = 0.05
    val discountForRegular = 0.01
    if (sum > 10_000_00) {
        sum -= (sum * discountOver1000).toInt()
        println("после применения 5% скидки - ${sumToString(sum)}")
    } else if (sum > 1_000_00) {
        sum -= standartSale
        println("после применения скидки 100 рублей - ${sumToString(sum)}")
    }
    if (buyer.regular) {
        sum -= (sum * discountForRegular).toInt()
        println("после применения 1% скидки - ${sumToString(sum)}")
    }
}

fun sumToString(sum: Int): String {
    return if (sum % 100 == 0) "${sum / 100} рублей" else "${sum / 100} рублей ${sum % 100} копеек"
}

