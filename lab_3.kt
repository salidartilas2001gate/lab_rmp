/**
 * In this example, `val` denotes a declaration of a read-only local variable,
 * that is assigned an pattern matching expression.
 * See http://kotlinlang.org/docs/reference/control-flow.html#when-expression
 */
//1
/*fun main(args: Array<String>) {
    val numbers = intArrayOf(1, 2, 3, 4, 5) // массив 
    /*for (a in numbers.indices){ // цикл вывода массива
        println("$a : ${numbers[a]}")
    }*/
    /*for (a in numbers.withIndex()){ // цикл вывода массива
        println("$a :")
    }*/
    
}*/

//2
/*fun main(args: Array<String>) {
    var i = 0
	var arr = emptyArray<String>() // пустой массив
    while (i<5){
        arr +=i.toString()
        i+=1
    } //заполнение массива
    println(arr) //вывод
}*/

//3
/*fun main(args: Array<String>) {

    var arr = arrayOfNulls<String>(5) // создание пустого массива
    //заполнение пустого массива
    arr.set(0,"a")
    arr.set(1,"b")
    arr.set(2,"c")
    arr.set(3,"d")
    arr.set(4,"e")
    println(arr[1])
    arr.get(2)
    for (a in arr){
        arr.get(a)
    } // выводим
}*/

//4
/*fun main(args: Array<String>) {
	val  i = 0
    var a= 0
    val myArray = Array(6, { i -> i * 2 })
	while (a < 6){
    	println(myArray[a])
        a+=1
    }    
}*/

//5
/*fun main(args: Array<String>) {

    val arr = arrayOf(1, 2, 3, 4, 5)
    //arr.forEach { i -> println("Значение элемента равно $i") }
    arr.forEachIndexed { index, element ->
    println("$index : $element")
	}
}*/

//6
/*fun main(args: Array<String>) {
     val myArray = arrayOf(1, 2, 3, 4, 5) // объявляем массив
    
    val start = args[0].toInt() // начало
    val stop = args[1].toInt() // конец

    for(i in start until stop)  // перебираем массив от start до stop
    {
        myArray[i] *= -1 // домнажаем на -1 элементы в интервале start до stop
    }
    
    myArray.forEach {
    println("The element is $it") // вывод массива при помощи forEach
    }
}*/

//1
/*fun main(args: Array<String>) {
    var numbers: Set<Int> = setOf(5, 6, -3, -5, 7, -1)
    var pair = numbers.partition{
        it * -1 >0
    } //разделяет на больше нуля
    println(pair)
    
}*/

//2
/*fun main(args: Array<String>) {
    val intsHashSet = hashSetOf(1,6, 2, 3, 4)
    println(intsHashSet)
    intsHashSet.add(5) //добавление
    println(intsHashSet)
    intsHashSet.remove(6) //удаление
    println(intsHashSet)
    println(intsHashSet.drop(2)) //отсекает от 2
    println(intsHashSet.take(2)) // отсекает после 2
    println(intsHashSet.filter { it >= 3 }) //выводит от 3 и более
    println(intsHashSet)
}*/

//3
/*fun main(args: Array<String>) {
    val list = hashSetOf(5, 6, -3, -5, 7, -1)
    var new_List = list.shuffled() // перемешивание массива
    println(new_List)
    println(list.contains(-1)) // проверка на наличие определённого чсла
	println(list.average()) // выводит среднее значение

}*/
//4

/*fun main(args: Array<String>) {

    val map1 = mapOf("beverage" to 2.7, "meal" to 12.4)  
    val map2 = map1.mapValues { it.value.toString() + "$" } // приписываем к значению value ($)
    println(map2) // {beverage=2.7$, meal=12.4$} // выводим измененный mapы

}*/
//5

fun main(args: Array<String>) {

    val currenciesMutableMap: MutableMap<String, String> =
    mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Лира" to "Турция")
    println("Страны: ${currenciesMutableMap.values}") // Страны: [Украина, США, Турция]
    println("Валюты: ${currenciesMutableMap.keys}") // Валюты: [Гривна, Доллар, Лира]
    println(currenciesMutableMap) // {Гривна=Украина, Доллар=США, Лира=Турция}
    currenciesMutableMap.put("Тугрик", "Монголия")
    println(currenciesMutableMap) // {Гривна=Украина, Доллар=США, Лира=Турция, Тугрик=Монголия}
    currenciesMutableMap.remove("Доллар")
    println(currenciesMutableMap) // {Гривна=Украина, Лира=Турция, Тугрик=Монголия}
    println(currenciesMutableMap.get("Гривна"))
	
    println(currenciesMutableMap.contains("Россия"))
    
}