//1.包生明
package my

fun test() {

}

class Runob {
    //2.函数定义
    //函数定义使用关键字fun  参数格式为：  参数：类型
    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun sum1(a: Int, b: Int) = a + b;

    //public 方法则必须明确写出返回类型
    public fun sum2(a: Int, b: Int): Int = a + b;


    //无返回值方法

    fun printSum(a: Int, b: Int): Unit {
        print(a + b);
    }

    //如果返回值为Unit类型，则可以省略（对于public方法也是这样，与带返回值的不同）
    public fun printSum1(a: Int, b: Int) {
        print(a + b)
    }
}

//3.可变长参数
//函数的变长参数可用 vararg 关键字进行标识
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}


//fun main(){
//    //vars(1,2,3,4,5)
//    //4.lambda（匿名类）
//    val sumLambda :(Int,Int) -> Int = {p,t ->p+t}
//    print(sumLambda(1,2))//输出为 3
//
//}
fun bianlaing() {
    /*5.定义常量与变量
可变变量定义：var 关键字
不可变变量定义：val关键字，只能赋值一次的变量（类似Java中的final修饰的变量）
常量与变量都可以没有初始值，但是在引用亲必须初始化
编译器支持自动类型判断，即声明时可以不指定类型，由编译器判断
 */
    val a: Int = 1
    val b = 1 //系统自动判断变量类型为Int
    val c: Int //如果不在声明时初始化则必须提供变量类型
    c = 1      //明确赋值
    var t = 5
    t += 1;
}

fun zifuchuanmoban() {
    /*
    6.字符串模板
    $表示一个变量名或一个变量值
    $varName 表示变量值
    ${varName.fun()}表示变量的方法返回值
     */

    var a = 1;
    //模板中的简单名称
    val s1 = "a is $a"
    a = 2
    //模块中的任意表达式
    val s2 = "${s1.replace("is", "was")},but now is $a"
}


fun nulljianchajizhi() {
    /*
    7.null检查机制
    Kotlin的空安全设计对于声明可为空的参数，进行空处理，两种处理方式，字段后加!!像Java一样抛出空异常，
    另外一种字段后加？可不做处理返回值为null或配合?:做判断处理
     */


    //类型后面加？表示可为空
    var age: String? = "23"

    //抛出空指针异常
    var age1 = age!!.toInt()
    //不做处理返回null
    var age2 = age?.toInt()
    //age 为空返回-1
    val age3 = age?.toInt() ?: -1

}

/*
  7.1当一个引用可能为null值时，对应的类型声明必须明确地标记为可为null.
  当str中的字符串内容不是一个整数时，返回null
 */
fun parseInt1(str: String): Int? {
    return 0

}

//fun main(args: Array<String>) {
//    if (args.size < 2) {
//        print("Two integers expected")
//        return
//    }
//
//    val x = parseInt1(args[0])
//    val y = parseInt(args[1])
//
//    //直接使用x*y导致错误，因为他们可能为null
//    if (x != null && y != null) {
//        //在进行过null值检测之后，x和y的类型被自动转换为非null变量
//
//        print(x * y)
//    }
//}


/**
 * 8.类型检测及自动类型转换
 * 使用is运算符检测一个表达式是否某类型的一个实例（类似于Java中instanceof关键字）
 *
 */

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        //做类型判断后，obj会被系统自动转换为String类型
        return obj.length
    }

    //在这里还有一种方法，与Java中instanceof不同，使用!is

//    if (obj !is String){
//
//    }
    return null
}

fun getStringLength1(obj: Any): Int? {
    if (obj !is String) {
        return null
    }

    return obj.length;
}

fun getStringLength2(obj: Any): Int? {
    if (obj is String && obj.length >0)
        return obj.length

    return null
}


/**
 * 9.区间
 * 区间表达式由具有操作符形式..的rangeTo函数辅以in或!in形式
 * 区间是为任何可比较类型定义的，对于整型原生类型，它有一个优化的实现
 */

fun qujian(){
    var i =4
    for (i in 1..4) print(i)//输出1234
    for (i in 4..1) print(i)//什么都不输出
    if (i in 1..10){ //等同于  1 <= i && i <=10
        print(i)
    }

    //使用step指定步长
    for (i in 1..4 step 2) print(i)//输出为"13"
    for (i in 4 downTo 1 step 2) print(i)//输出"42"

    // 使用until函数排除结束元素
    for (i in 1 until 10){ //i in[1,10)排除10
        print(i)
    }
}


fun main(args: Array<String>) {
    var i = 1
    print("循环输出：")
    for (i in 1..4) print(i)
    print("\n----------------")
    print("设置步长")
    for (i in 1..4 step 2) print(i)
    print("\n----------------")
    print("使用downTo")
    for( i  in 4 downTo 1 step 2) print(i)
    print("\n----------------")
    print("使用until：")
    for (i in 1 until 4){
        print(i)
    }
    print("\n----------------")
}

