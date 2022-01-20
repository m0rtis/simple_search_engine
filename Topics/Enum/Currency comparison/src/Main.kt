fun main() {
    val (countryOne, countryTwo) = readLine()!!.split(' ')
    val countryOneCurrency = Currency.getCurrencyNameByCountry(countryOne)
    val countryTwoCurrency = Currency.getCurrencyNameByCountry(countryTwo)

    println(countryOneCurrency == countryTwoCurrency)
}

enum class Currency(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun getByCountryName(name: String): Currency? {
            return try {
                Currency.valueOf(name)
            } catch (_: Exception) {
                null
            }
        }

        fun getCurrencyNameByCountry(countryName: String): String {
            return Currency.getByCountryName(countryName)?.currency ?: ""
        }
    }
}