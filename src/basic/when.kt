package basic


fun main(args: Array<String>) {
    var str:String = "abc"

    when(str) {
        "abc" -> {
            print("abc")
            print("hello")
        }
        "123" -> print("123")
        else -> {
            print("others")
        }
    }

}

private fun getRadiusByDiameter(boundaryType: String, diameter: Double): Int {
    return when (boundaryType) {
        "Lighting" ->  if (diameter >= 0.251) 300 else 450
        "Machine" ->  300
        "People" -> if (diameter >= 0.251) 600 else 900
        else -> 0
    }
}

