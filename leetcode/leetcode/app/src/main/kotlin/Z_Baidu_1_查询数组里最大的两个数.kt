
import java.util.ArrayList

fun main() {
    val arrayList = ArrayList<Int>()
    arrayList.add(6)
    arrayList.add(65)
    arrayList.add(26)
    arrayList.add(64)
    arrayList.add(36)
    arrayList.add(66)
    arrayList.add(67)
    arrayList.add(96)
    arrayList.add(46)
    arrayList.add(236)
    arrayList.add(416)
    arrayList.add(4326)
    arrayList.add(6432)
    arrayList.add(326)
    arrayList.add(651)
    println(getMaxResult(arrayList).toString())
}

private fun getMaxResult(array: ArrayList<Int>): ArrayList<Int> {
    val result = ArrayList<Int>()

    if (array.size <= 2) {
        return array
    }

    var firstInt = array[0]
    var secondInt = array[1]

    var firstIndex = 2

    while (firstIndex < array.size) {

        if (firstInt > secondInt) {
            secondInt = array[firstIndex].coerceAtLeast(secondInt)
        } else {
            firstInt = array[firstIndex].coerceAtLeast(firstInt)
        }

        firstIndex++
    }

    result.add(firstInt)
    result.add(secondInt)

    return result
}