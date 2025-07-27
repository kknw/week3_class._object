package example.myapp
import example.myapp.decor.makeDecorations
import java.lang.Math

//fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//    println("Shark: ${shark.color}")
//    shark.eat()
//    println("Plecostomus: ${pleco.color}")
//    pleco.eat()
//}
//
//fun main () {
//    //makeFish()
//    makeDecorations()
//}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}


