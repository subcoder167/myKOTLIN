import java.util.*

fun main(){

    val reader = Scanner(System.`in`)
    print(message = "Enter perpendicular of the right angled triangle : ")

    val perp = reader.nextFloat()

    print(message = "Enter hypotenuse of the right angled triangle : ")

    val hypo = reader.nextFloat()

    print("Enter base of the right angled triangle : ")

    val base = reader.nextFloat()

    val sin = { a:Float, c:Float -> a/c}
    val cos = { b:Float, c:Float -> b/c}
    val tan = { a:Float, b:Float -> a/b}

    print("Enter function you want to find(sin, cos, or tan) : ")

    val choice = readLine()

    val result: Float=when(choice){
        "sin" -> sin(perp,hypo)
        "cos" -> cos(hypo,base)
        "tan" -> tan(perp,base)
        "Sin" -> sin(perp,hypo)
        "Cos" -> cos(hypo,base)
        "Tan" -> tan(perp,base)

        else -> 0.0f
    }

    println("$choice = $result")
}