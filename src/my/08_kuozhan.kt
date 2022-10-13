package my

/*
扩展
Kotlin可以对一个类的属性和方法进行扩展，且不需要继承或使用Decorator模式
扩展是一种静态行为，对被扩展的类代码本身不会造成任何影响
 */



/*
扩展函数
扩展函数可以在已有类中添加新的方法，不会对原类做修改
 */

//fun receiverType.functionName(patams){
//    body
//}


class User(var name:String)


//扩展函数
fun User.Print(){
    println("用户名$name")
}


//fun main(array: Array<String>) {
//    val user = User("Runnoob")
//    user.Print()
//}


/*
扩展MutableList函数。扩展出swap函数
 */
fun MutableList<Int>.swap(index1 : Int ,index2 : Int){
    val tmp = this[index1]  //this对应该列表

    this[index1] = this[index2]
    this[index2] = tmp
}




//fun main(array: Array<String>){
//    val l = mutableListOf<Int>(1, 2, 3)
//    //位置0和2的值做互换
//    l.swap(0,2)//"swap"函数内的"this"将指向'l'的值
//
//    println(l.toString())
//
//}




/*
扩展函数是静态解析的
扩展函数是静态解析的，并不是接收者类型的虚拟成员，在调用扩展函数时，具体被调用的的是哪一个函数，由调用函数的的对象表达式来决定的，而不是动态的类型决定的:
 */
open class C

class D :C()

fun C.foo() = "c"//扩展函数
fun D.foo() = "D"//扩展函数

fun printFoo(c:C){
    println(c.foo())

}


//fun main(){
//    printFoo(D())
//}



/*
若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数。
 */

class C1{
    fun foo(){
        println("成员函数")
    }
}


fun C1.foo(){
    println("扩展函数")
}

//fun main(){
//    println(C1().foo())
//}



/*
扩展一个空对象
在扩展函数内， 可以通过 this 来判断接收者是否为 NULL,这样，即使接收者为 NULL,也可以调用扩展函数.
 */


fun Any?.toString():String{
    if(this == null)return "null"

    return toString()
}

//fun main() {
//    var t = null
//    println(t.toString())
//}

/*
扩展属性
除了函数，kotlin也支持对属性进行扩展
扩展属性只能被声明为val
 */


val <T> List<T>.lastIndex :Int
   get() = size -1


/*
伴生对象的扩展
如果一个类定义有一个伴生对象 ，你也可以为伴生对象定义扩展函数和属性。

伴生对象通过"类名."形式调用伴生对象，伴生对象声明的扩展函数，通过用类名限定符来调用：
 */

class MyClass{
    companion object {

    }
}

fun MyClass.Companion.foo(){
    println("伴生对象的扩展函数")
}


val MyClass.Companion.no : Int
get() = 10


fun main(){
    println("no:${MyClass.no}")

    MyClass.foo()
}


/*
扩展的作用域
通过扩展函数或属性定义在顶级包下
 */
//fun Baz.goo(){
//
//}


/*
扩展声明为成员
在一个类内部你可以为另一个类声明扩展
在这个扩展中有个多个隐含的接受者，其中扩展方法定义所在类的实例成为分发接受者，而扩展方法的目标类型的实例，称为扩展接受者
 */

class D1{
    fun bar(){
        println("D bar")
    }
}


class C11 {
    fun baz(){
        println("C baz")
    }

    fun D1.foo(){
        bar()//调用D1.bar
        baz()//调用C.baz
    }

    fun caller(d:D1){
        d.foo()
    }


}












