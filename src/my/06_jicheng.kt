package my

import javax.naming.Context

/*
继承

Kotlin中所有的类都继承该Any类，它是所有类的超类，对于没有超类型声明的类默认是超类
 */


class Exmample //从Any隐式继承

/*
Any提供三个函数
equals()
hashCode()
toString()
Any不是Java.lang.Object
如果一个类要被继承，可以使用open关键字进行修饰
 */

open class ExBase(p : Int)

class Deriveds(p:Int) :ExBase(p)



/*构造函数
子类有主构造函数
如果子类有主构造函数，则基类必须在主构造函数中立即初始化
 */


open class Persons(var name :String,var age:Int){//基类
}

class Student(name :String,age: Int,var no :String,var score :Int) :Persons(name,age){

}

/*
子类没有主构造函数
若没有主构造函数，则必须在每一个二级构造函数中使用super关键字初始化基类，或者在代理另一个构造函数，初始化基类时，可以调用基类的不同构造方法
 */


class Student1 : Persons{

    constructor(name:String,age: Int):super(name,age){

    }


    constructor(name: String,age: Int,sex:String):super(name,age){

    }
}



open class PersonBase(name :String){

    constructor(name:String,age:Int):this(name){

    }
}


class StudentData : PersonBase{
    constructor(name: String,age: Int,sex :String) :super(name,age){

    }
}


/*
重写
在基类中使用fun 声明函数时，此函数默认为final修饰，不能被子类重写，如果允许子类重写该函数，那么就要手动添加open修饰它，子类重写方法使用override
接口的成员变量和方法默认是open的
 */

open class PersonOver(name: String){
    open fun foo(){

    }
}

class StudentOver(name:String) :PersonOver(name){
    override fun foo() {
        super.foo()

    }
}


/*
属性重写
属性重写使用override关键字，属性必须具有兼容类型，每一个生命的属性都可以通过初始化程序get方法被重写

用var定义的属性可以用val重写，反过来不可以，因为val属性本身定义了getter方法，重写为var属性会在衍生类中额外声明一个setter方法
可以在主构造函数中使用override关键字座位属性声明的一部分
 */


open class Foo{
    open val x : Int get() {
        return 0
    }
}

class Bar1 : Foo() {
    override val x :Int = 10
}



interface Foo1{
    val count :Int
}

class Barr(override val count :Int) :Foo1{

}

class Barr1:Foo1{
    override var count: Int = 0


}











