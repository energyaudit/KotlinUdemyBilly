package legacy

fun main(args:Array<String>){
    try {
        val randomInteger = (-10..12).shuffled().first()
        println("randomInteger is $randomInteger" )
        var div=100/randomInteger
        println("DIV:$div")
    }catch (ex:Exception){
        println(ex.message)
    }
}