/**
 * Created by aravindmc on 2/18/2016.
 * Reading a name from a string
 */

fun main(args:Array<String>){
    if(args.size == 0)
    {
        println("Please provide a name")
        return
    }
    println("Hello, ${args[0]}")
}
