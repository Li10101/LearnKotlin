package my

//循环控制
/*
1.for循环
for循环对任何提供和迭代器的对象进行遍历
循环体可以是一个代码块
for(item :Int in ints){

}
通过索引遍历数组或者list
for(i in array.indices){
    print(array[i])
}

 */

//fun main(args :Array<String>){
//
//    val items = listOf("apple","banana","kiwi")
//
//    for (item in items){
//        println(item)
//    }
//
//    for (index in items.indices){
//        println("item at $index is ${items[index]}")
//    }
//}

/*
2.while与do...while循环
两者不同do...while至少执行一次
 */


//fun main(args: Array<String>){
//    println("------while使用------")
//    var x = 5
//    while (x > 0){
//        println(x--)
//    }
//
//    println("------do while使用------")
//    var y = 5
//    do {
//        println(y--)
//    }while (y > 0)
//
//}

/*
3.返回和跳转

return 默认从最直接包围他的函数或者匿名函数返回
break终止最直接包围他的循环
continue继续下一次最直接包围他的循环
 */
fun main(args: Array<String>){
   for (i in 1..10){
       if (i == 3) continue
       println(i)
       if (i >5) break
   }

}



/*
4.break和continue标签

 */
fun biaoqian(){
    loop@ for(i in 1..100) {
        for (j in 100..200) {
            if (j == 7) break@loop
        }

    }
}

/*
5.标签处返回
 */




