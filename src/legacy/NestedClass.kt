package legacy
class Outer {

    private  val name:String?="InnerClassName"

   inner class Nested {
        
        fun Show(){
            println(name)
        }
    }

}


fun  main(args:Array<String>){

   var outer=Outer()

    var nested=outer.Nested()
    nested.Show()


}