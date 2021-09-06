package com.github.fabriciolfj.compraservice.business.case

import com.github.fabriciolfj.compraservice.business.SaveProduct
import com.github.fabriciolfj.compraservice.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.lang.RuntimeException
import java.util.*

@Component
class ProductCase {

    @Autowired
    private lateinit var saveProduct: SaveProduct

    fun execute(product: Product) : String {
        product.apply {
            this.code = UUID.randomUUID().toString()
            saveProduct.save(this);
        }

        return product.code ?: throw RuntimeException("Code fail generated")
    }
}