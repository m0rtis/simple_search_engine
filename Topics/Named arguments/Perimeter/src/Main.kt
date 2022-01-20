import kotlin.math.hypot

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x3,
    y4: Double = y3
): Double {
    val sideOne = computeDistance(Pair(x1, y1), Pair(x2, y2))
    val sideTwo = computeDistance(Pair(x2, y2), Pair(x3, y3))
    val sideThree = computeDistance(Pair(x3, y3), Pair(x4, y4))
    val sideFour = computeDistance(Pair(x4, y4), Pair(x1, y1))

    return sideOne + sideTwo + sideThree + sideFour
}

fun computeDistance(pointA: Pair<Double, Double>, pointB: Pair<Double, Double>): Double {
    val x = pointB.first - pointA.first
    val y = pointB.second - pointA.second
    return hypot(x, y)
}