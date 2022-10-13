package lean1


/**
 * Kotlin要求非空类型的属性必须要在构造方法中进行初始化
 * 有时这种 要求不太方便，比如可以通过依赖注入或是单元测试情况下进行属性的赋值
 *
 * 通过lateinit 关键字标识属性为延迟初始化，需要满足如下三个条件
 *
 * 1.lateinit 只能在类体中声明var属性上，不能用在柱构造函数声明的属性上
 * 2.属性不能有自定义的setter和getter方法
 * 3.属性类型需要为非空，期望不能是原生数据类型
 */
class HelloWorld1 {

    lateinit var number :Man

    val age : Int
    get() {return 10}


    class TestPersion(name :String){
        //backing field 支撑字段
        //backing property 支撑属性


        var username : String = name
        get() = "dd"
        set(value) {
            field = value
        }
    }

    class Man{

    }
}

/*
可见性   public private internal protected

默认情况下为 public
 */

/**
 * 扩展  extension
 *
 * 扩展函数的解析是静态的
 * 1.扩展函数并不会真正的修改目标类，也就是说他不会再目标类中添加新的属性和方法
 * 2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
 * 3.调用是由对象声明类型所决定的，而不是由对象的实际类型决定
 *
 *
 * 伴生对象也是可以扩展的
 *
 * 扩展的作用域
 * 1.扩展函数所定义的类实例叫做分发接受者
 * 2.扩展函数所扩展的的那个实例叫做扩展接受者
 * 3.当以上两个名字出现冲突是，扩展接受者的优先级最高
 *
 *
 *
 * 扩展可以很好的解决Java中充斥的各种辅助类问题
 * Collections.swap(list,4,10)
 * Kotlin扩展
 * list.swap(4,10)
 *
 */



class ExtendioTest{
    fun add(){

    }

    fun subtract(){

    }
}



fun ExtendioTest.multiply(){

}






class DD {
    fun method(){
        println("DD method")
    }
}



class EE {
    fun method2(){

    }

    fun DD.hello(){
        method()
        method2()
    }

    fun world(dd:DD){
        dd.hello()
    }


    fun DD.outPut(){
        println(toString())//这里调用的是扩展类的
        println(this@EE.toString())//this@EE调用自己类的
    }


    fun test(){
        var dd = DD()
        dd.outPut()
    }

}


fun main(args: Array<String>) {

}
