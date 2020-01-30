package legacy

import java.util.*
//import kotlin.collections.ArrayList
class Person(var name:String,var age:Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {
      return this.age-other.age
    }
}

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

    var listofNames1=ArrayList<Person>()
    listofNames1.add(Person("Jena",3))
    listofNames1.add(Person("Laya",5))
    listofNames1.add(Person("HUSSEIN",26))
    println("before sort")
    for (person in listofNames1){
        println(person)
        println("Name:"+person.name)
        println("Name:"+person.age)
    }
    println("after sort")
    Collections.sort(listofNames1)//V1
    //listofNames.sort()
    for (person in listofNames1){
        println(person)
        println("Name:"+person.name)
        println("Name:"+person.age)
    }
}