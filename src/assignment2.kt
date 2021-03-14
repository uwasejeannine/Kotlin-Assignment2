fun main() {
    college("AkiraChix")
    println(parameters("jeannine", 20))
    println(comp("happy"))
    firstName("jeannine")
    firstName("Uwase")
}
fun college(name:String){
    var name ="AkiraChix"
    print(name[0])
    print(name[2])
    println(name[3])

}
fun parameters(x: String,y:Int):String{
    return "Hello my name is $x and I am $y old"

}
fun comp(comp:String):Int{
    return comp.length
}

fun firstName(name: String){
    if (name=="jeannine"){
        println("that's me")

    }
    else{
        println("I don't know who is that")
    }

}



