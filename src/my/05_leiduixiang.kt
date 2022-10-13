package my

/*
类和对象
1.类定义
包含构造函数，初始化代码块，函数，属性，内部类，对象声明
Kotlin找那个没有new 关键字

 */
class Runoob {
    var name: String = "Li"
    var age: Int = 10;
    fun foo() {
        println("foo")
    }
}

//空类
class Empty

/*
kotlin类中可以有一个主构造器及多个次构造器，主构造器是类头部的一部分，位于类名称之后
如果柱构造器没有任何注解，也没有任何可见修饰符，可以不写constrctor

类中不能有字段，备用字段使用field关键字声明，field关键字只能用于属性的访问器

非空属性必须在定义的时候初始化，kotlin提供了一种延迟初始化的方案  使用lateinit关键字描述属性
 */
class Person constructor(firstName: String) {}

class Person1(firstName: String) {

}

class Person2 {
    var lastName: String = "张"
        get() = field.toUpperCase()
        set

    var no: Int = 100
        get() = field//后端变量
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }

    var height: Float = 145.4f
        private set
}


//fun main(){
////    val site = Runoob()
////    site.age
////    site.name
//    var persio = Person2()
//    persio.lastName = "wang"
//
//    println("lastName ${persio.lastName}")
//    persio.no = 9
//    println("no:${persio.no}")
//
//    persio.no = 20
//    println("no:${persio.no}")
//
//}

/*
2.主构造器
主构造器中不能包含任何代码，初始化代码可以放在初始化代码段中，初始化代码块使用init关键字作为前缀
 */

class Person3 constructor(firstName: String) {
    init {
        println("FirstName is $firstName")
    }
}


class Runoob1 constructor(name: String) {
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var sitName = name


    init {
        println("初始化网站名：$name")
    }

    //次构造函数
    constructor(name: String, alexa: Int) : this(name) {

    }

    fun printTest() {
        println("我是类的函数")
    }
}


//fun main(array: Array<String>){
//    var runoob = Runoob1("菜鸟教程")
//    println(runoob.sitName)
//    println(runoob.url)
//    println(runoob.country)
//    runoob.printTest()
//}


/*
3.次构造函数
类也可以有二级构造函数，需要加constructor
 */



class Person4 {
    constructor(parent: Person4) {

    }
}


class Person5(val name: String) {

    constructor(name: String, age: Int) : this(name) {

    }
}

/*
抽象类
 */

open class Base {
    open fun f() {

    }
}


abstract class Derived : Base {
    constructor() : super()

    override abstract fun f()

}


/*
嵌套类
 */
class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}
//fun main(array: Array<String>){
//    val foo = Outer.Nested().foo()
//    println(foo)
//}


/*
内部类
内部类使用inner关键字来修饰
内部类会带有一个对外部类的对象的引用，所以内部类可以访问外部类成员属性和成员函数
 */


class Outer1 {
    private val bar: Int = 1
    var v = "成员属性"


    //嵌套内部类
    inner class Inner {
        fun foo() = bar //访问外部类成员
        fun innerTest() {
            var o = this@Outer1//获取外部类的成员变量
            println(o.v)
        }
    }
}


/*
匿名内部类
使用对象表达式来创建内部类
 */


class Test {
    var v = "成员变量"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }

}

interface TestInterFace {
    fun test()
}


fun main(array: Array<String>) {
    var test = Test()
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("对象表达式穿件匿名内部类的实例")
        }

    })
}

/*
类的修饰符
 */


//类属性修饰符
//abstract  //抽象类
//final     //类不可继承，默认属性
//enum      //枚举类
//open      //类可继承，类默认是final
//annotation//注解类

//访问权限修饰符
//private 仅在同一个文件中可见
//public  所有调用者可见
//internal同一个模块可见


