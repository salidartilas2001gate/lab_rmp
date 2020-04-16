// №10
/**Arguments
 * a y z
 */
fun main(args: Array<String>) {
    for (name in args)
        println("Hello, $name!")
}

//№ 3
/**
 * 
 */
fun main(args: Array<String>) {
    var num = 123
    println(counter(num))
    fullStr(num)
}

fun counter (inputValue:Int): Int
{
    val str = "$inputValue sm."
    return str.length
}

fun fullStr(a:Int):String
{
    val str = "$a см."
    return str
}

/**4
* sposob 2
*/
fun counter(a:Int,b:Int) = if (a >; b) a else b{
    "$a см.".length
    }

// ?fun fullStr2(a:Int) = "$a см."

/**6 7
 * 
 */
fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument") //if argument = null **№7 argument = abc
        return
    }
    println("Hello, ${args[0]}!")
}

//
/* fun main(args: Array<String>) {
    var str = "Hello, "
    for (a in args)
        str += a
    println(str)
} */


/**
 * sum
 */
fun main(args: Array<String>) {
    println("Первое слогаемое: ${args[0]},")
    println("Второе слогаемое: ${args[1]},")
    println("Сумма: ${args[0].toInt() + args[1].toInt()}")
}
/**
 * fact
 */
fun main(args: Array<String>) {
    var factorial = 1
    for (name in args)
    factorial = factorial * name.toInt()
    println("5! равно $factorial")
}

/**
 * №8
 */
fun main(args: Array<String>) {
    println("Фамилия: ${args[0]},")
    println("Имя: ${args[1]},")
    println("Отчество: ${args[2]}")
}

/**
 * sum 12345
 */
fun main(args: Array<String>) {
    var summ = 0
    for (name in args)
        summ += name.toInt()
    println("Сумма = $summ")
}

/**
 * 13
 */

fun main(args: Array<String>) {
    var str = ""
    for (name in args)
        str += name + " "
    println(str)
}


/**
 * 14
 */

fun main(args: Array<String>) {
    for (index in args.indices)
        println("item at ${index} is ${args[index]}")
    
}

/**
 * 15
 */

fun main(args: Array<String>) {
    var index = 0
    while (index < args.size) 
    {
        println("item at ${index} is ${args[index]}")
        index++
    }   
}


/**
 * 
 * labs 2
 * 
 */
/*
 *1
 */ 

fun main(args: Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}
/*
 *2
 */ 

fun main(args: Array<String>) {

    val a1 = 3                                 /**class kotlin.Int*/
    val a2 = 3L                                /**class kotlin.Long */
    val a3 = 3f                                /**class kotlin.Float */
    val a4 = 3.0                               /**class kotlin.Double */
    val a5 = "Unknown"                         /**class kotlin.String */
    val a6 = "3"                               /**class kotlin.String */
    val a7 = "Long"                            /**class kotlin.String */
    val a8 = '3'                               /**class kotlin.Char */

    println(a1::class)
    println(a2::class)
    println(a3::class)
    println(a4::class)
    println(a5::class)
    println(a6::class)
    println(a7::class)
    println(a8::class)

}

/*
 *3
 */ 

fun main(args: Array<String>) {

    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'

    println(describe(a1))                     /**Not a string
                                                Long
                                                Not a string
                                                Not a string
                                                Unknown
                                                Unknown
                                                Unknown
                                                Not a string */
    println(describe(a2))
    println(describe(a3))
    println(describe(a4))
    println(describe(a5))
    println(describe(a6))
    println(describe(a7))
    println(describe(a8))

}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}


/*
 *4
 */ 

fun main(args: Array<String>) {

    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'

    println(describe(-5))
    println(describe(4L))
    println(describe(3.0))
    println(describe("wfertykul"))
    println(describe(4))
    println(describe("Hello"))
    println(describe(1))

}
/**
 * Not a string
Long
Not a string
Unknown
Not a string
Greeting
One
 */
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}




/*
 *5
 */ 
class EventManager {

    companion object FirebaseManager {
        
    }  
}

fun declaration(obj: Any): String 
{
    
    var a = when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
    return a
}

    
/*
 *6
 */ 
/////////////////////////////////////
 
/*
 *7
 */ 
 fun main(args: Array<String>) {
    val x = 10 /// fits in range
    val y = 9 
    // val x = 9  /// fits in range
    // val y = 10
    if (x in 1..y+1) {
        println("fits in range") 
    } else {
        println("out of range")
    }
}


fun main(args: Array<String>) {
    val x = 10 /// out of range
    val y = 9
    // val x = 9  /// fits in range
    // val y = 10
    if (x in 1..y-1) {
        println("fits in range")
    } else {
        println("out of range")
      }
}

/*
 *8
 */ 

fun main(args: Array<String>) {

    test(5)
    test(11)
    test(25)
    test(15)

}

fun test(x: Any)
{
    val validNumbers = arrayOf(1,11,111,1111)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

/*
 *9
 */ 

fun main(args: Array<String>) {

    var items = arrayOf("orange","apple")
    //проверка массива 100% нужен apple

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    

}

/*
 *10
 */ 

fun main(args: Array<String>) {

    println(hasPrefix("prefixhjkl"))
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}