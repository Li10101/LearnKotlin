package learn2

//数据类  -data class
//lombok

/**
 * 1.主构造方法至少有一个参数
 * 2.所有的主构造方法参数都需要被标记为var或val
 * 数据类不能是抽象的，open的，sealed的以及inner的 （sealed密封类，inner内部类）
 *
 *
 *
 * 对于数据类，编译会自动生成一下内容：
 * 1.equal/hashCode
 * 2.toString()方法 形式Persion(name=LI, age=11, adress=河北)
 * 3.针对属性的componentN方法，并且是按照属性的声明顺序来生成的
 *
 *
 *
 *
 */

data class Persion(val name :String ,var age :Int,var adress :String)


fun main(args: Array<String>) {
    var persion = Persion("LI",11,"河北")
    println(persion)
}