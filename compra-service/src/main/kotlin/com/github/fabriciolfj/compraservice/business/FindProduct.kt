package com.github.fabriciolfj.compraservice.business

import com.github.fabriciolfj.compraservice.domain.Product
import com.github.fabriciolfj.compraservice.domain.ProductPrice
import java.util.*

interface FindProduct {

    fun findByCode(code: String): Optional<Product>
    fun findPrices(code: String): List<ProductPrice>
}