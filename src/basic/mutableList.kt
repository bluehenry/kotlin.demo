package basic


fun main(args: Array<String>) {
    var ll1: MutableList<MutableList<Int>>
    ll1 = mutableListOf()

    var l1 = mutableListOf<Int>()

    l1.add(1)
    l1.add(2)
    l1.add(3)

    println(l1.size)

    ll1.add(l1)
    for( i in 0 until ll1.size step 1)
    {
        println(ll1[i])
    }

    for( index in ll1.indices)
    {
        println(ll1[index])
    }

}
