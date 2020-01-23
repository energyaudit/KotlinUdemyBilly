package legacy

import java.util.*
//import kotlin.collections.ArrayList


fun main(args:Array<String>) {
    var listofNames=ArrayList<String>()
    listofNames.add("Jena")
    listofNames.add("Laya")
    listofNames.add("HUSSEIN")
    println("before sort")
    for (name in listofNames){
        println(name)
    }
println("after sort")
    Collections.sort(listofNames)//V1
    //listofNames.sort()
    for (name in listofNames){
        println(name)
    }
}