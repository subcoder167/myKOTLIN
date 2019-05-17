package lambdaCal

import java.util.*

fun main() {

    val c = Scanner(System.`in`)
    print("Enter 1st no: ")
    val num1 = c.nextFloat()
    print("Enter 2nd no: ")
    val num2 = c.nextFloat()

    print("Enter the function you want to perform(+,-,*,/) : ")
    val choice = c.next()

    val result = {x:Float,y:Float,ch:String -> when(ch){
        "+" -> x add y
        "-" -> x subtract y
        "*" -> x multiply y
        "/" -> x divide y
        else -> 0.0f
    }}
    print("Result is : ${result(num1,num2,choice)}")
}

infix fun Float.add(other:Float):Float {
    return this + other
}
infix fun Float.subtract(other:Float):Float {
    return this - other
}
infix fun Float.multiply(other:Float):Float {
    return this * other
}
infix fun Float.divide(other:Float):Float {
    return this / other
}