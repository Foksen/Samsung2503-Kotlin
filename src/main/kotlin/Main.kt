import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")
    println(sum(14, 13))
    println("14 + 13 = ${sum(14,13)}")

//    val a = 10
//    a = 5     - нельзя изменять val
//    var b = 10
//    b = 5
//    val c:Int   // можно также с var
//    c = 10

//    val scanner = Scanner(System.`in`)
//    val input = scanner.nextInt()
//    println(input)

    isEven(5)
    println(isEven2(0))
    println(isEven3(4))
    println(getMonthName(3))

    for (i in 0..10) {      // цикл i от 0 до 10 включительно
        print("$i ")
    }
    println()
    for (i in 0 until 10) {     // цикл i от 0 до 9 включительно
        print("$i ")
    }
    println()
    for (i in 20 downTo 0 step 4) {      // цикл от 20 до 0 включительно с шагом 4
        print("$i ")                               // счётчик i внутри цикла изменять нельзя. Если надо - используй while
    }
    println()

    val array = intArrayOf(10, 29, 14)     // инициализировать массив. Массив динамический
    // val относится к указателю на массив, сам массив изменяемый
    for (i in array) {      // foreach
        print("$i ")
    }
    println()

    val m = isEven4(0)
    println(m)      // >> null

    val k: TestClass? = isEven5(0)      // защита от null-pointer-exception
    k?.test()       // если k != null, то выполнится, иначе - нет       (? вызывает метод если объект не null)
//    k!!.test()      // !! - заставить проигнорировать null-safety     (!! полностью игнорируют null safety)

    val p: TestClass? = isEven5(0) ?: TestClass(false)
// Элвис-оператор (если вернёт null, то будет использовано значение српава после оператор)

}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun printMyName(name: String) {
    print("My name is $name")
}

fun isEven(a: Int) {
    if (a == 0)
        println("Zero")
    else if (a % 2 == 0)
        println("Even")
    else
        println("Odd")
}

fun isEven2(a: Int): String {
    return if (a == 0) {
        "Zero"
    }
    else return if (a % 2 == 0) {
        "Even"
    }
    else return "Odd"
}

fun isEven3(a: Int): String =
    if (a == 0)
        "Zero"
    else if (a % 2 == 0)
        "Even"
    else
        "Odd"

fun getMonthName(monthNumber: Int) =        // Когда фун-я через =, можно не указывать возвращаемый тип
    when (monthNumber) {                    // when - альтернатива switch-case
        1 -> "JAN"
        2 -> "FEB"
        3 -> "MAR"
        4 -> "APR"
        5 -> "MAY"
        6 -> "JUN"
        7 -> "JUL"
        8 -> "AUG"
        9 -> "SEP"
        10 -> "OCT"
        11 -> "NOV"
        12 -> "DEC"
        else -> "Error"
    }

fun isEven4(a: Int): Boolean? = Test.isEven(a)      // ? - не уверены, что не вернётся 0

fun isEven5(a: Int): TestClass? {
    if (a == 0)
        return null
    return TestClass(a % 2 == 0)
}

// 1. fun - начало функции
// 2. Параметры функции записываются так: (название: Тип)
// 3. В котлине возвращаемое значение записывается после двоеточия после параметров. Если void - ничего не надо
// 4. В котлине нет примитивных типов (int), есть только "обёрточные" (Int)
// 5. Экранирование строк: "text: ${value}". Если одна переменная можно без скобок "text: ${x}"

// 6. Объявление переменных - val и var. val - неизменяемая, var - изменяемая
// 7. Нет динамической типизации (после присваения Int нельзя перевести в Double)
// 8. Перевод с помощью метода toString()

// 9. val похожа на const, однако она позволяет инициализировать (один раз) после определения (val x:Int)