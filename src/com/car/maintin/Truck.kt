package com.car.maintin

class Truck:CarOptions{

    var subType:String?=null
    constructor(  type:String,  model:Int,   price:Double,
                  milesDrive:Int,   owner:String,subType:String):
            super(type,  model ,   price , milesDrive ,   owner ){

        this.subType=subType
    }
    constructor(  type:String,  model:Int,   price:Double, milesDrive:Int,subType:String):
            super(type,  model ,   price , milesDrive){

        this.subType=subType

    }


    override fun getCarPrice():Double{

        return this.getPrice()!!- (this.milesDrive!!.toDouble()*20)
    }

    fun getCarPriceWrapper():Double{
        return super.getCarPrice()
    }
}

//fun Truck.getCarPriceWrapper():Double{//if u want to add method outside class then use extension,but extension
//    return this.getCarPrice()//cannot access super as the method inside class
//}




fun main() {

    val truck1 = Truck("BMW",2015,10000.0,105,"Hussein Alrubaye","Dump")
    truck1.type="KIA"

    println(truck1.type)
    println(truck1.owner)
    //println(truck1.price)
    println(truck1.getCarPrice())
    println("public method use super to call parent method: "+truck1.getCarPriceWrapper())

    val truck2 = Truck("Toyota",2019,39000.0,10,"Garbage")
    println(truck2.type)
    println(truck2.owner)
    println(truck2.getCarPrice())

}