package legacy

//fun main(args:Array<String>){
//var t1=thread()
//    t1.start()
//}
//
//class thread():Thread(){//class thread(threadName:String):Thread(){
//    override  fun run(){
//        var count=0
//        while (count<10){
//            println("$threadName count:$count")//not works
//            count++
//            try {
//                Thread.sleep(1000)
//            }catch (ex:Exception){
//                println(ex.message)
//            }
//        }
//    }
//}

fun main(args:Array<String>){
var t1=thread("thread1")
    t1.start()
    var t2=thread("thread2")
        t2.start()
    var t3=thread("thread3")
            t3.start()
}

class thread():Thread(){
    var threadName:String=" "
    constructor(threadName: String) :this(){
        this.threadName=threadName
    }
    override  fun run(){
        var count=0
        while (count<10){
            println(this.threadName+ "  count:$count")//this.threadName must put outside
            count++
            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}