package legacy

import com.example.cars.MyCar;//import class from another package to use
fun main(args:Array<String>){
    var myclass=MyCar()//use the class from another package
    myclass.ShowInfo()
}