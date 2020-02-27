package basic


fun main(args: Array<String>) {
    var l1: List<Int>
    var l2: List<Int>
//    var list1: List<List<List<Int>>>

    l1 = listOf(1,3,5)
    l2 = listOf(2,4,6)
    var list1 = listOf(listOf(l1, l2))


    for ( innerList in list1) {
        for ( i in innerList[0])
        print(innerList)
    }
}

