package product

import java.lang.Exception

class ProductUseCaseImpl  : ProductUseCase {

    private val listProduct = getListProduct()

    override fun showProduct(): List<Product> {
        return listProduct
    }

    override fun getProduct(id: String): Result<Product> {
        val data = listProduct.filter {
            it.uid == id
        }
        return if (data.isNotEmpty())
            Result.Success(data[0])
        else
            Result.Error(Exception("Data Kosong"))
    }
}
