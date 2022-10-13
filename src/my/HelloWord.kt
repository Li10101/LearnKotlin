package my
val PI = 3.14;

var x = 5
fun main(){
    val a:Int = 1;
    val b = 2;
    val c:Int
    c = 3

    val PI = 3.14;

    var x = 5
    x+=1

    val s1 = "a is $a"

    println("Hello World!")
    println(sum(3,5));
    printSum(-1,8);

    val s2 = "${s1.replace("is","was")},but now is $a"

}
fun printProduct(age1:String,age2:String){
    val x = parseInt(age1);
    val y = parseInt(age2);
    if (x != null && y != null){
        println(x*y)
    }else{
        println("'$age1'")
    }
}


fun maxOf(a:Int,b:Int):Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun parseInt(str:String):Int?{
    return null
}


fun sum(a:Int,b:Int):Int{
    return a + b
}

fun printSum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}
fun incrementX(){
    x+=1
}