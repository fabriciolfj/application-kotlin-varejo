package com.github.fabriciolfj.compraservice.business.case

import com.github.fabriciolfj.compraservice.business.FindProduct
import com.github.fabriciolfj.compraservice.business.SaveProduct
import com.github.fabriciolfj.compraservice.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class ProductCase {

    @Autowired
    private lateinit var saveProduct: SaveProduct
    @Autowired
    private lateinit var findProduct: FindProduct

    fun execute(product: Product) : String {
        product.apply {
            this.prices = findProduct.findPrices(product.code)
            saveProduct.save(this);
        }

        return product.code
    }

    fun execute(code: String) : Product {
        return findProduct.findByCode(code)
            .orElseThrow { throw RuntimeException("Product not found") }
    }
}