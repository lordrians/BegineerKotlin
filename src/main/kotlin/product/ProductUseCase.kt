package product

interface ProductUseCase {
    fun showProduct(): List<Product>
    fun getProduct(id: String): Result<Product>
}