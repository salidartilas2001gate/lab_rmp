    // 1


    fun main(args: Array<String>) 
    {
        class Person{   // Класс Person
            var name: String = "sali"   // Объявляем свойства
            var age: Int = 22   // Объявляем свойства
         
            val info: String    // geter свойство
                get() = "Name: $name  Age: $age"    // Возвращает строку
        }
        
        val a = Person()    // Обьявляем переменную a класса Person
    
        a.name = "kira"  // Изменяем свойство переменной
        a.age = 19  // Изменяем свойство переменной
        println(a.info)     // Выводим на экран строку
        
    }
    
    // 2
    
    fun main(args: Array<String>) 
    {
        class Person{   // Класс Person
            var name: String = "nn"
                get(){
                return field.toUpperCase() //возвращает значени переменной name и при этом переводит все символы в верхний регистр 
            }
                set(value){
                        if(value.length >= 2) // проверяет длину значения которое мы пытаемся записать в name a.name = "fefe"
                        field = value // заменяет значение в переменной name
    
                    }
            
            var age: Int = 20
        }
        
        val a = Person()
        println(a.name)
        a.name = "a"//  после данной строки срабатывает set
        println(a.name)
        
    }
    //3
    
    fun main(args: Array<String>) 
    {
        class Gate{     // Класс gate
            val IN : Int = 1    // Статические переменны, можно рассматривать как константы
            val OUT: Int = -1
            val CLOSED: Int = 0
            var mSwing: Int = 0  // Переменная mSwiming
            
            fun getSwingDirection(): Int = mSwing  // геттер метод возвращающий mSwing
            fun setSwing(direction: Int): Boolean   // сеттер метод записывающий mSwing
            {
                if (direction == IN || direction == OUT || direction == CLOSED)
                {
                    mSwing = direction 
                    return true  // возвращает true в случае выполнения условия (direction == IN || direction == OUT || direction == CLOSED)
                } 
                return false
            }
            fun open(direction: Int): Boolean // функция открытия ворот
            {
                if (direction == IN || direction == OUT) // если положение ворот 1 или -1 
                {
                    setSwing(direction) // то вызывается сеттер и возвращается true
                    return true
                } 
                return false
            }
            fun close() // фунция закрытия ворот которое устанавливает значение mSwing = 0
            {
                mSwing = CLOSED
            }
            fun thru(count: Int): Int //функция управляющая количеством и передвижение улиток
            {
                if (mSwing == IN) return count
                if (mSwing == OUT) return -count
                if (mSwing == CLOSED) return 0
                return 0
            }
            override fun toString(): String // просто проверка состояния ворот в данный момент
            {
                if (mSwing == CLOSED) return "This gate is closed"
                if (mSwing == IN) return "This gate is open and swings to enter the pen only"
                if (mSwing == OUT) return "This gate is open and swings to exit the pen only"
                return "This gate has an invalid swing direction"
                
                // ворота, которые закрыты
                // воротa, которые установлены в положение IN
                // воротa, которые установлены в положение OUT
                // ворота, у которых положение отлично от IN, OUT или CLOSED
            }
    
        }
    
        val a = Gate() // создание экземляра класса
        a.setSwing(1)
        println(a.toString()) //вызов функции toString
    
    }
    
    /**
     * 4
     */
    fun main(args: Array<String>){
    interface Clickable{ // объявление интерфейса Clickable
    fun click() //абстрактный метод click
    
    class Button : Clickable{ //объявление класса Button
    override fun click() = println("I was clicked")//абстрактный метод click который выводит "I was clicked"
    }
    val a = Button()
    a.click()
    }
        
    /**
     *5
     */
        fun main(args: Array<String>){
        interface Clickable{ // объявление интерфейса Clickable
        fun click() = println("I was clicked") // создаётся функция click и здесь же задаётся её тело
        }
        
        interface MyInterface{ // объявление интерфейса MyInterface
        fun click() = println("Other text")// создаётся функция click и здесь же задаётся её тело
        }
        
        class Button : Clickable, MyInterface{
        override fun click() = super<MyInterface>.click()//определяется из какого интерфейса будет взято тело для функции click
        }
        val but = Button()
        println(but.click())
        }}