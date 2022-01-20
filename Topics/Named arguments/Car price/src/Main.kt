// complete this function, add default values
const val NEW_CAR_PRICE = 20000
const val PER_YEAR_PRICE_REDUCTION = 2000
const val MAX_SPEED_CORRECTION = 100
const val MAX_SPEED_THRESHOLD = 120
const val MILEAGE_PRICE_REDUCTION = 200
const val MILEAGE_THRESHOLD = 10000
const val AUTOMATIC_TRANSMISSION_COST = 1500

fun carPrice(
    old: Int = 5,
    kilometers: Int = 100000,
    maximumSpeed: Int = 120,
    automatic: Boolean = false
) {
    val agePriceReduction = old * PER_YEAR_PRICE_REDUCTION
    val maxSpeedPriceCorrection = (maximumSpeed - MAX_SPEED_THRESHOLD) * MAX_SPEED_CORRECTION
    val mileagePriceReduction = kilometers / MILEAGE_THRESHOLD * MILEAGE_PRICE_REDUCTION
    val transmissionCost = if (automatic) AUTOMATIC_TRANSMISSION_COST else 0

    println(NEW_CAR_PRICE - agePriceReduction + maxSpeedPriceCorrection - mileagePriceReduction + transmissionCost)
}