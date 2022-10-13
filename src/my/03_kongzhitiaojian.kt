package my

/*
控制条件
 */

/*
1.if表达式
if语句包含一个布尔表达式和一条或多条表达式
 */

fun ifbiadashi(){
    val a : Int = 1;
    val b :Int = 2;
    var max = a;
    if (a < b) max = b

    var maxx :Int
    if (a > b ){
        max = a;
    }else{
        max = b
    }
    val maxxx = if (a > b) a else b



    val maxxxx = if (a > b){
        print("")
        a
    }else{
        print("")
        b
    }
}
/*
2.使用区间
 */
fun main(args :Array<String>){
    val x = 5
    val y = 9
    if (x in 1..8){
        print("x在区间内")
    }
}
/*
3.when表达式
when类似于其它语言的Swatch操作符
else相当于swatch中的default

 */

fun whenbiaodashi(){

    val items = setOf<String>("apple","banban","cece")
    var x :Int = 1
    when(x){
        1 -> print("x==1")
        2 -> print("x==2")
        3,4 -> print("等于3等于4")
        in 1..10 -> print("属于1-10")
        !in 10..20 -> print("不属于")
        is Int -> print("")
        else ->{
            print("x既不等于1，也不等于2")
        }
    }

    /*
    when中使用in运算判断集合是否包含某实例
     */
    when{
        "apple" in items -> println("fsfs")
        "cdcd" in items -> println("cdcd")
    }

}