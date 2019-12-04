package helloworld

fun main(args: Array<String>) {
    var enableFlag = true
    val env = "prod" ?: "local"
    println(env)
    if (env.equals("prod"))
        enableFlag = false;

    println(enableFlag)


}

