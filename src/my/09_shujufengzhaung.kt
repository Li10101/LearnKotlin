package my

/*
数据类与封装类
 */

/*
1.数据类
kotlin可以创建一个包含数据的类，关键字data
数据类满足以下条件
主构造函数至少包含一个参数
所有的柱构造函数的参数必须标识为val或var
数据类不可以声明为abstract,open,sealed 或inner
数据类不能继承其它类（单可以实现接口）
 */

data class UserBean(val name: String, val age: Int)


/*
2.复制
复制使用copy()函数，我们可以使用该函数复制对象并修改部分属性，
 */

fun main() {
    val jack = UserBean(name = "javk", age = 1)
    val oldeJack = jack.copy(age = 2)
    println(jack)
    println(oldeJack)
/*
3.数据类以及解构声明
组件函数允许数据类在解构声明中使用
 */
    val jane = UserBean("jane", 5)


    val (name, age) = jane
    println("name:$name,age:$age")
}

/*
4.标准数据类
标准库提供了 Pair 和 Triple
 */

/*
密封类
 */














