package my


/*
kotlin 接口
 */
interface MyInterface {

    var name :String
    fun bar() //为实现

    fun foo() {//已实现
        //可选的方法体
        println("foo")
    }
}

/*
实现接口
一个类或者对心实现一个或多个接口
 */

class Child : MyInterface{
    override var name :String = ""//重写属性
    override fun bar() {

    }

}