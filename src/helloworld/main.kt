package helloworld

fun main(args: Array<String>) {
    val henry = Person("Henry")

    println("Name is ${henry.Name}")
    henry.display()

    henry.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}