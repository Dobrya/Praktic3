fun main(args: Array<String>) {
    println("Hello World!")
    //Задание 1
    val myAge = 18
    val isTeenager = myAge > 13 && myAge < 19
    //Конец 1 задания

    //Задание 2
    val theirAge = 30
    val bothTeenagers = isTeenager && (theirAge > 13 && theirAge < 19)
    //Конец 2 задания

    //Задание 3
    val reader = "Mykhammad"
    val author = "Richard Lucas"
    val authorlsReader = reader == author
    //Конец 3 задания

    //Задание 4
    val readerBeforeAuthor = reader > author
    //Конец 4 задания

    //Задание 5
    val myAge2 = 18
    if (myAge2 > 13 && myAge2 < 19)
        println("Подросток")
    else
        println("Не подросток")
    //Конец 5 задания

    //Задание 6
    val answer: String
    if (myAge2 > 13 && myAge2 < 19)
        answer = "Подросток"
    else answer = "Не подросток"
    println(answer)
    //Конец 6 задания

    //Задание 7
    var counter = 0
    while (counter < 10) {
        print("counter равен $counter")
        counter++
    }
    //Конец 7 задания

    //Задание 8
    counter = 0
    var roll = 0
    do {
        roll = (0..5).random()
        counter++
        println("После $counter бросков roll равен $roll")
    }  while (roll != 0)
    //Конец 8 задания
} //Aнекдот:
/*Черный юмор
как еда в Африке,
не до всех
доходит
 */