package example.myapp
import example.myapp.decor.makeDecorations
import java.lang.Math

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main () {
    //makeFish()
    makeDecorations()

}

