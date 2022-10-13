package lean1


//主构造方法是头部的一部分
class HelloKotlin constructor(name :String){

    var name :String
    init {
        this.name = "zhangwang"

    }



    constructor(name :String ,age :Int) :this(name){
        this.name = name


    }

    constructor(name :String ,age :Int,address :String) : this(name,age){

    }

}

interface A {
    fun method(){
        println("A")
    }
}


open class B{
    open fun method(){

    }
}

class C : B(),A{

    override fun method() {
        super<A>.method()
        super<B>.method()
    }

}
fun main(args: Array<String>) {
    var hell = HelloKotlin("Li",9)
    println(hell.name)
    MyObject.method()

    //MyTest.MyObject.method()
    MyTest.method()
    println(MyTest.a)

}


object MyObject{
    fun method(){

    }
}

//伴生对象     相当与Java中的静态方法  一个类中只允许有一个伴生对象
//在kotlin中与Java不同的是，类事没有static方法的
//在大多数情况下，Kotlin推荐的做法是使用包级别的函数来座位静态方法
//kotlin 会将包级别的函数当做静态方法来看待

//companion  伴生对象会生成一个静态内部类
//注意 虽然伴生对象的成员看起来像是Java的静态成员，但是运行期，他们依然是真实的实例成员
//在jvm上，可以将伴生对象的成员真正生成为类的静态方法与属性，这通过@JvmStatic注解来实现的
//伴生对象会生成一个静态内部类



class MyTest{
    companion object {//若不写名字会提供一个默认的名字Companion

        var a :Int = 100

        @JvmStatic
        fun method(){
            println("method")
        }
    }



}