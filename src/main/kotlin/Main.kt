fun main() {
    println("Приложение мeломан")
    val meloman = true
    val acountCum = 100_000
    val skidka = 100  //скидка при покупку от 1001 до 10000 рублей
    val discountStart = 1_000
    val percentDiscount = 0.05 * acountCum
    val percentDiscountStart = 10_000 // сумма с которой начинается скидка 5 процентов
    val usuallyCus = 0.99 // дополнительная скидка

    val result = if (!meloman) {
        if (acountCum > percentDiscountStart) acountCum - percentDiscount
        else if (acountCum > discountStart) acountCum - skidka
        else acountCum
    } else {
        if (acountCum > percentDiscountStart) (acountCum - percentDiscount) * usuallyCus
        else if (acountCum > discountStart) (acountCum - skidka) * usuallyCus
        else acountCum * usuallyCus
    }
    println("Итого в сумме $result")
}

