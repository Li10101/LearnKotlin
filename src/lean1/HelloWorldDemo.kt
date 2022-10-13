package lean1

import java.lang.NumberFormatException

fun main(args: Array<String>) {
//    val list: List<String> = listOf("hello", "world", "hello world")
//
//    for (str in list) {
//        println(str)
//    }
//
//    println("----------")
//
//    list.forEach(Consumer { print(it) })
//
//    println("----------")
//
//
//    list.forEach(System.out::println)
//
//
////    var x = 10
////    var y = 20
////    var max = if (x >y) x else y
//    var x = 10
//    var y = 20
//    var max = if (x > y) {
//
//        println("x>y")
//        x//最后一个表达式座位返回的结果
//    } else {
//        println("x<y")
//        y
//    }
//    getArray()
//
//
//    var a = 6
//    var result = when(a){
//        1 -> {println("1")
//            1}
//        2 -> {println("2")
//            2}
//        2,3,5 -> {println("5")
//            5}
//        in 6..10 -> {println("10")
//            10}
//        else -> 0
//    }
    myfilterMapSorted()
    myStringGe()
}

fun sum(a: Int, b: Int) = a + b


fun myPrint(a: Int, b: Int) {
    println("${a + b}")
}


fun convert2Int(str: String): Int? {

    try {
     return str.toInt()
    } catch (exc: NumberFormatException) {
      return null
    }
}


fun printMultiply(str :String,str1 :String){
    var a2Int = convert2Int(str)
    var b2Int = convert2Int(str1)

    if (null != a2Int && null != b2Int) {
        println(a2Int + b2Int)
    } else {
        println("参数补位INt")
    }
}







fun conver2Uppercase(str :Any) :String?{
    if (str is String){
        return str.toUpperCase()

    }
    return null
}

fun getArray(){
    var array :IntArray = intArrayOf(1,2,3,4)
    val mutableListOf = mutableListOf<String>("1", "3")

    for (i in  array){
        println(i)
    }


    for (item in array.indices){//indices获取索引
        println("array[$item]= ${array[item]}")
    }

    for ((index,value)in array.withIndex()){//与上面indices一样的
        println("array[$index] = $value")
    }
}



fun myPrint(str :String) :String {

    when(str) {
        "hello" -> return "HELLO"
        "li"    -> return "Li"
        else ->   return ""
    }

}


fun myPrint2(str :String):String {
    return when(str){
        "hello" -> "Hello"
        "li"    -> "LI"
        else    -> ""
    }
}


fun myPrint3(str:String) = when(str){
    "hello" -> "Hello"
    "li"    -> "LI"
    else    -> ""
}



fun myMyFor(){
    for (i in 2..10){

    }


    for (it in 2.rangeTo(10)){

    }



    for (i in 2..10 step 2){

    }


    for (i in 10 downTo 2 step 2){

    }
}




fun myfilterMapSorted(){
    var array = listOf<String>("hello","world","welcome")
    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }


}


fun myStringGe(){
    var a :String = """adsfdsfsdfs
        fsdfsdfdsfsdfsd
        fsdfsdfsdfsdfsd
        fdsfsfds
    """
    println(a)
}
//数组相关
