import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType



fun main(args: Array<String>)   // мини тест классов
{
    //Owner: George Washington; has a pool; has a big open space
    var house1 = House()
    house1.House(20,25,50,50,"George Washington")
    println(house1.toString())
    //Business: unoccupied (total offices: 16)
    var offices1 = Office()
    for(i in 0..49)
    {
        offices1.Office(20,25,50,50)
    }
    offices1.setParkingSpaces(50)
    println(offices1.toString())

}

open class Building     //класс постройки
{
    private var mLength : Int = 0       //длинна постройки
    private var mWidth : Int = 0        // ширина постройки
    private var mLotLength : Int = 0        //длинна участка
    private var mLotWidth : Int = 0     //ширина участка

    public fun Building(length: Int, Width: Int, LotLength: Int, LotWidth: Int) //функция инициализацие постройки
    {
        mLength = length        // присвоение длинны постройки
        mWidth = Width          // присвоение ширины постройки
        mLotLength = LotLength      // присвоение длинны участка
        mLotWidth = LotWidth        // присвоение ширины участка
    }
    public fun setLength(value: Int) { mLength = value}     //функция задающий длину постройки
    public fun setWidth(value: Int) { mWidth = value}       //функция задающий ширину постройки
    public fun setLotLength(value: Int) { mLotLength = value}       //функция задающий длину участка
    public fun setLotWidth(value: Int) { mLotWidth = value}     //функция задающий ширину участка
    public fun getLength() :Int { return  mLength}      //функция возвращающий длину постройки
    public fun getWidth() :Int { return  mWidth}        //функция возвращающий ширину постройки 
    public fun getLotLength() :Int { return  mLotLength}    //функция возвращающий длину участка
    public fun getLotWidth() :Int { return  mLotWidth}  //функция возвращающий ширину участка
    public fun calcBuildingArea() :Int { return  mLength * mWidth}  //функция считающий площадь постройки
    public fun calcLotArea() :Int { return  mLotLength * mLotWidth} //функция считающий площадь участка
    public override fun toString() :String      //замена стандартной функции toString()
    {
        var s :String = ""
        s += "BuildingArea: "
        s += calcBuildingArea().toString()  //считаем площадь постройки
        s += "; LotArea: "
        s += calcLotArea().toString()   //считаем площадь участка
        return  s
    }
}

open class House : Building()   //класс дом наследуется от постройки
{
    private var mOwner: String = ""     //владелец
    private var mPool: Boolean = false  //флаг наличия бассейна
    public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int) :Int   // инициализация параметров вариант 1
    {
        super.Building(length, Width, LotLength, LotWidth)      //через super обращаемся к родительскому классу
        mOwner = ""
        mPool = false
        return  0
    }
    public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int, owner: String) :Int         // инициализация параметров вариант 2
    {
        House(length, Width, LotLength, LotWidth)
        mOwner = owner  //задаем владельца
        return  0
    }
    public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int, owner: String, pool: Boolean) :Int  // инициализация параметров вариант 3
    {
        House(length, Width, LotLength, LotWidth, owner)
        mPool = pool    //задаем бассеин
        return  0
    }
    public fun getOwner() :String { return  mOwner}     //функция возвращающий владельца
    public fun hasPool() :Boolean { return mPool }      //функция возвращающий флаг наличия бассейна
    public fun setOwner(value: String) { mOwner = value }   //функция задающий владельца
    public fun setPool(value: Boolean) { mPool = value }    //функция задающий флаг наличия бассейна
    public override fun toString() :String  //замена стандартной функции toString()
    {
        var s :String = ""
        s += "Owner: "
        if (mOwner.isEmpty()) {s += "n/a"}  // записываем n/a если нет владельца
        else { s += "$mOwner" }     //если есть владелец записываем его
        if (hasPool()) s += "; has a pool"  //пишем если есть бассеин
        if (calcLotArea() > calcBuildingArea()) s += "; has a big open space"   //пишем если площадь участка больше площади постройки
        return  s
    }
    public  fun equals(value: House) :Boolean   //функция сравнения двух похожих домов по признакам
    {
        if (value.mPool == mPool &&
            value.calcBuildingArea() == calcBuildingArea()) { return true}  //если есть бассеин и площадь постройки равна то вернуть true
        return  false       //иначе false
    }

}

class Cottage : House()         //класс котедж унаследован от дома
{
    private var mSecondFlor: Boolean = true //наличие второго этажа
    public fun Cottage(dimension: Int, LotLength: Int, LotWidth: Int) :Int  //инициализация параметров катеджа вариант 1
    {
        super.House(dimension, dimension, LotLength, LotWidth)  //через super обращаемся к родительскому классу
        return  0
    }
    public fun Cottage(dimension: Int, LotLength: Int, LotWidth: Int, owner: String, SecondFlor: Boolean) :Int  //инициализация параметров катеджа вариант 2
    {
        super.House(dimension, dimension, LotLength, LotWidth, owner)   //через super обращаемся к родительскому классу
        mSecondFlor = SecondFlor    //задаем второй этаж
        return  0
    }
    public fun hasSecondFloor() :Boolean { return mSecondFlor }     //функция возвращающий наличие второго этажа
    public override fun toString() :String  //замена стандартной функции toString()
    {
        var s :String = super.toString()    // обращаемся через super к родителю и вызываем функция toString()
        if (hasSecondFloor()) s += " has a Second Floor;"   // тдописываем наличие второго этажа если это так
        s += " is a cottage"    //указываем что это катедж
        return  s
    }

}

class Office : Building()   //класс офиис
{
    private var mBusinessName: String = ""  //название бизнеса
    private var mParkingSpaces: Int = 0 //парковачные места
    private var sTotalOffices: Int = 0  //количество офисов
    public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int)   //инициализация офиса вариант 1
    {
        super.Building(length, Width, LotLength, LotWidth)
        mBusinessName = ""
        mParkingSpaces = 0
        sTotalOffices++     //увиличиваем количество оффисов при каждой новой инициализации
    }
    public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int, businessName: String) //инициализация офиса вариант 2
    {
        Office(length, Width, LotLength, LotWidth)
        mBusinessName = businessName    //задаем имя бизнеса
    }
    public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int, businessName: String, parkingSpaces: Int) //инициализация офиса вариант 3
    {
        Office(length, Width, LotLength, LotWidth, businessName)
        mParkingSpaces = parkingSpaces  //задаем парковачные места
    }
    public fun getBusinessName() :String { return  mBusinessName}       //функция возвращающий имя бизнеса
    public fun getParkingSpaces() :Int { return  mParkingSpaces}    //функция возвращающий количество парковачных мест
    public fun setBusinessName(value: String) { mBusinessName = value}  //функция задающий имя бизнеса
    public fun setParkingSpaces(value: Int) { mParkingSpaces = value}   //функция задающий количество парковочных мест
    public override fun toString() :String  //замена стандартной функции toString()
    {
        var s :String = ""
        s += "Business: "
        if (mBusinessName.isEmpty()) {s += "unoccupied"}    //записать при отсутствии имени бизнеса
        else { s += "$mBusinessName" }  //записать имя бизнеса при наличии
        if (mParkingSpaces > 0) s += "; has $mParkingSpaces parking spaces" //вывести количество парковачных мест если (mParkingSpaces > 0)
        s += " (total offices: $sTotalOffices)" //иначе вывести что нет парковки
        return  s
    }
    public  fun equals(value: Office) :Boolean  //функция сравнения двух похожих офиссов по признакам
    {
        if (value.mParkingSpaces == mParkingSpaces &&      
            value.calcBuildingArea() == calcBuildingArea()) { return true}//если количество парковачных и площадь постройки равны то вернуть true
        return  false
    }

}