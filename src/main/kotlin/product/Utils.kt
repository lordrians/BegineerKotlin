package product

fun getListProduct(): ArrayList<Product>{
    val product1 = Product(
        uid = "A1",
        name = "Infinix Hot 11S NFC RAM 6GB ROM 128GB",
        isAvailable = true,
        price = 1999999
    )
    val product2 = Product(
        uid = "A2",
        name = "Xiaomi Redmi 10 RAM 6GB ROM 128GB",
        isAvailable = true,
        price = 2239000
    )
    val product3 = Product(
        uid = "A3",
        name = "Samsung Galaxy A03 RAM 4GB ROM 64GB",
        isAvailable = true,
        price = 2250000
    )
    val product4 = Product(
        uid = "A4",
        name = "Xiaomi Redmi Note 10 Pro RAM 8GB ROM 128GB",
        isAvailable = true,
        price = 3099000
    )
    val product5 = Product(
        uid = "A5",
        name = "Realme C11 RAM 2GB ROM 32GB",
        isAvailable = true,
        price = 1199000
    )
    val product6 = Product(
        uid = "A6",
        name = "Infinix Note 11 NFC RAM 6GB ROM 128GB",
        isAvailable = true,
        price = 1995000
    )
    val product7 = Product(
        uid = "A7",
        name = "Realme 8 RAM 8GB ROM 128GB",
        isAvailable = true,
        price = 2885000
    )
    val product8 = Product(
        uid = "A8",
        name = "Apple iPhone 11 64GB",
        isAvailable = true,
        price = 6005000
    )
    val product9 = Product(
        uid = "A9",
        name = "Apple iPhone 12 Pro Max 512 GB",
        isAvailable = true,
        price = 17155000
    )
    val product10 = Product(
        uid = "A10",
        name = "Apple iPhone 12 Mini 64 GB",
        isAvailable = true,
        price = 8500000
    )
    return arrayListOf(
        product1,
        product2,
        product3,
        product4,
        product5,
        product6,
        product7,
        product8,
        product9,
        product10
    )
}

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val error: Exception) : Result<Nothing>()
}