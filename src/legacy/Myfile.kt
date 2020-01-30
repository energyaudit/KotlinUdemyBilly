package legacy

import java.io.FileReader
import java.io.FileWriter
fun main(args:Array<String>){

    println("1-read,2-write")
    val randomInteger = (1..2).shuffled().first()
     println(randomInteger)
    when(randomInteger){
        1->{
            ReadFromFile()
        }
        2->{
            WriteToFile("hussein")
        }
    }
//    ReadFromFile()
//    WriteToFile("hussein")
}
fun WriteToFile(str:String){
    try{
       // var fo=FileWriter("test.txt")//version1, no append
        var fo=FileWriter("test.txt",true)//version2, if this file already exist then append
        fo.write(str+"\n")
        fo.close()
    }catch (ex:Exception){
        print(ex.message)
    }
    println("app is done")
}

fun ReadFromFile(){
    try {
var fin=FileReader("test.txt")
        var c: Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        print(ex.message)
    }
}
