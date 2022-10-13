package learn2

/*
密封类（sealed -class）
 */

/*
关于嵌套类与内部类之前的区别


1.嵌套类：对于Java的静态内部类（即有static关键字修饰的内部类），只要在一个类的内部定义了另一个类，那么这个类就叫做嵌套类
，相当于Java当中static关键字修饰的内部类
2.内部类：对应Java中非静态内部类（即内有static关键字修饰的内部类），使用inner关键字在一个类的内部所定义的另外一个类就叫做内部类，
相当于Java当中没有static关键字修饰的内部类

 */



//嵌套类
class OutClass{
    var str :String = "LL"

    class meat{
        fun method1(){
            println("Liiiii")
        }

    }

}


//内部类

class Out2Class{
    var str1 :String = "KLKL"

   inner class method{
        fun  mea() : String{
            return this@Out2Class.str1
        }
    }



}

fun main(args: Array<String>) {

    println(OutClass.meat().method1())

    println(Out2Class().method().mea())
}

