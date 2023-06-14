fun main() {
    println("Приложение меломан")
    var amountSum = 100000
    var skidka = 100 //скидка при покупку от 1001 до 10000 рублей
    var skidkaOtOneCaus = amountSum - (amountSum / 100) * 5 // 5% скидка 
    var OnePro = skidkaOtOneCaus / 100 // дополнительная скидка

    if (amountSum >= 0 && amountSum <= 1000) {
        println("Скидка не предоставляется")
    } else if (amountSum >= 1001 && amountSum <= 10_000) {
        println("Скидка составит 100 рублей")
        print("Сумма покупки вместе со скидкой составит ")
        print(amountSum - 100)
        print(" рублей")
    } else if (amountSum >= 10_001) {
        println("Вам предоставлена скидка 5%")
        print("Сумма покупки вместе с 5% скидкой составит ")
        print("$skidkaOtOneCaus")
        println(" рублей")
        print("Дополнительная скидка 1% постоянным покупателям составит $OnePro")
        println(" рублей")
        print("Общая сумма со всеми скидками составит " )
        print(skidkaOtOneCaus - OnePro )
        print(" рублей")
    } else println("Ошибка при указании суммы")
}
