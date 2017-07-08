package kotl

fun main(args: Array<String>) {
    println("Hello, world!")

    val student = Student("","")

    student.id = "nknk"
    student.id = "nkzn"

    val list = arrayOf(1,2,3,54,4,7,5,6,7)
    var avr: Double = 0.0
    var index54:Int
    for(num in list){
        avr = avr + num
    }
    avr = avr/list.size
    println("avr= " + avr.toString())
    //println(printString())
    var c = 6
    for(index in args.indices){

    }

    when(c){
        in 5..7 ->{

        }
        8->{

        }
    }



    var text:String? = "sdkjvb"
    text = null


    var text2 = c.toString()
    var array = emptyArray<Int>()

    var st = String()


    fun printString(): Int{
        var a = 5
        val b = 9
        a=8
        var bool = false
        if(bool){
            return a+b
        }
        else
            return b
    }
    fun convertToString (value: Int): String{


        return value.toString()

    }
}
