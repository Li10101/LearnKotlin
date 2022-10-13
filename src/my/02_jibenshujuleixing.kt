package my

import java.lang.IllegalArgumentException

//基本数据类型

/*
1.比较两个数字
三个等号===比较对象地址，两个等号==比较两个值得大小
 */
//fun main(args:Array<String>){
//
//    val a :Int  =  10000;
//    print(a ===a)//true
//    val boxedA: Int? = a;
//    val anotherBoxedA: Int? = a;
//
//    print(boxedA === anotherBoxedA)//false
//    print(boxedA == anotherBoxedA)//true
//}



/*
2。类型转换
 */
fun leixingzhuanhuan(){
    val b: Byte = 1
    val i:Int = b.toInt()
}

/*
3.位操作符
 */
fun weicaozuo(){

}

/*
4.字符
和Java不同，kotlin中char不能直接和数字操作，必须加''包含起来，如普通字符'0','a'
 */

fun decimalDigitValue(c : Char):Int {
    if (c !in '0'..'9'){
        throw IllegalArgumentException();
    }
    return c.toInt() - '0'.toInt()//显示转换为数字
}

/*
5.布尔
||  或
&&  与
！  非
 */



/*
6.数组
数组创建两种方式
[]运算符代表成员函数get()和set()
 */


//fun main(args: Array<String>){
//
//
//    val arr = arrayOf(1,2,3)
//
//    val b = Array(3,{i -> (i *2) })
//
//    print(arr[0])
//    print(b[1])
//}



/*
7.字符串
[]方括号方便获取字符串中的某个符号，也可以通过循环遍历
三个引号"""括起来的字符串，支持多行字符串
String 通过trimMargin()方法删除多余空白
 */

fun zifuchuan(){
    val str = "abck"
    str[0]
    for (c in str){
        print(c)
    }
}

fun main(args : Array<String>){
    val text = """
        多行字符串
        多行
        多行
    """.trimMargin()
    print(text)

}
/*
8.字符串模板

 */