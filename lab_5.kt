/**
 * 1
 */
fun main(args: Array<String>)
{
    var stud: Student = Student(822201)
    var ex: Array<String> = arrayOf("Механика", "Программирование")
    var marks: Array<Int> = arrayOf(2, 9)
    stud.setExams(ex, marks)
    println(stud.toString())
}

open class  Student(id: Int)        // Класс студент
{
    private var id: Int = id        // id
    private var exams: Array<ExamsResult> = emptyArray()        //Массив экзаменов

    private inner class ExamsResult(name: String){      //внутренний класс (результат Экзамена)
        private var name: String = name     // Имя экзамена
        private var mark: Int = 0       // баллы или оценка
        private var passed: Boolean = false     // флажок - сдан не здан

        open fun passExam(){        // метод задающий сдачу экзаменна
            passed = true
        }

        open fun setMark(mark: Int){        // метод устанавливающий оценку
            this.mark = mark
        }

        open fun getMark() = mark       // метод возвращающий оценку

        open fun getPassedMark() : Int{     // метод возвращающий минимальную оценку для прохождения экзамена
            val PASSED_MARK: Int = 4;
            return PASSED_MARK
        }

        open fun getName() = name       // метод получения имени экзамена
        open fun isPassed() = passed        // метод получающий состояние экзамена

    }

    open fun setExams(name: Array<String>, marks: Array<Int>){      //метод установки экзаменов (принимает массивы: названий и оценок экзаменов)
        if (name.size != marks.size)        
            throw IllegalArgumentException()        // выведит ошибку если массивы названий и оценок экзаменов разного размера
        exams = Array(name.size) { ExamsResult("null") }    // определяет массив пустых элементов экзаменов с размером полученным из массивов (name: Array<String>, marks: Array<Int>)
        for (i in name.indices) //цикл от 0 до конца массива
        {
            exams.set(i, ExamsResult(name[i]))  // задаем имя экзамена
            exams[i].setMark(marks[i])      // задаем оценку экзамена
            if (exams[i].getMark() >= exams[i].getPassedMark())     // если оценка больше или равна минимальной требуемой
                exams[i].passExam()     // то устанавливаем экзамен как сданный
        }
    }

    open override fun toString(): String {      // замена стандартного метода toString
        var res: String = "Студетн: $id\n"      //объявляем строку которую будем вводить
        for (i in exams.indices)        // перебираем весь массив экзаменов
        {
            if (exams[i].isPassed())  
                res += exams[i].getName() + " сдал \n"// пишем если экзамен сдан
            else
                res += exams[i].getName() + " не сдал \n"// пишем если экзамен не сдан
        }
        return res      // возвращаем строку
    }

}

/**
 * 2
 */
fun main(args: Array<String>) {

    //вызов статического метода
    Ship.LifeBoat.down()  // вызов без объявления экземпляра

    //создание объекта статического класса
    val lf = Ship.LifeBoat() //вызов обычного метода
    lf.swim()       // вызов с объявлением экземпляра класса
}


open class Ship {       // класс Ship
    private val id = 0  //id

    class LifeBoat {        //класс LifeBoat
        fun swim() {    // метод swim()
            println("отплытие шлюпки")
        }

        companion object { // разрешает пользоватьс свойствами и методами как синглтон, т.е. вызов без объявления экземпляра класса
            fun down() {      // метод down()
                println("шлюпки на воду!")
            }
        }
    }

}

/**
 * 3 не обязательно
 */

 /**
  * 4
  */
 // объявляем абстрактный класс Figure
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter(): Float
 
    // абстрактный метод для получения площади
    abstract fun area(): Float
}
 //объявляем производный класс Rectangle
class Rectangle(val width: Float, val height: Float) : Figure(){
    //переопределённый метод perimeter
    override fun perimeter(): Float{
          return width * 2 + height * 2;
      }
    //переопределённый метод area
    override fun area(): Float{
          return width * height;
      }
  }
  //объявляем производный класс Rectangle
  class Treugol(val height: Float, val a:Float,val b:Float,val c:Float):Figure(){
    //переопределённый метод perimeter
    override fun perimeter(): Float{
        return a+b+c
  }
     //переопределённый метод area
     override fun area(): Float{
        return (a*height)/2
  }
  }
  //объявляем производный класс Trapeciya
  class Trapeciya(val height: Float, val a:Float,val b:Float,val c:Float,val d:Float):Figure(){
    //переопределённый метод perimeter
    override fun perimeter(): Float{
        return a+b+c+d
  }
  //переопределённый метод area
  override fun area(): Float{
    return ((a+b)/2)height
  
  }
  }