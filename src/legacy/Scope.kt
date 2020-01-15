package legacy

var name:String?=null

fun showUserInfo(){
    name="Welcome $name"
    println(" $name")

}


fun main() {
    name = "Hussein"
    println(" $name")
    println(" call function showUserInfo() and var name is shared ,so its value can be changed by showUserInfo()")
    showUserInfo()
    println("main name function can paralell with other function likeshowUserInfo:   $name")

}