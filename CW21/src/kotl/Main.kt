package kotl


fun main(args: Array<String>) {

    var array = arrayOf(1, 4, 54, 6, 7, 3, 7)
    var avr:Double = 0.0
    var index54:Int = 0
    var count: Int = 0
    for(num in array.indices) {
        if(array[num]==54)
            index54 = num
        count++
        avr+=array[num]

    }

    avr = avr/count
    println("Average meaning = " + avr.toString())
    println("Index =  " + index54.toString())

    var newArray = array.filter { it !=7 }

    println(newArray.toString())
}
fun convertToString (value: Int): String{


    return value.toString()

}

