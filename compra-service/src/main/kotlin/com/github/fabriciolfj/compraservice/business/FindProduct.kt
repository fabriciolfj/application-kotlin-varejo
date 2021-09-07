package com.github.fabriciolfj.compraservice.business

import com.github.fabriciolfj.compraservice.domain.Product
import java.util.*

interface FindProduct {

    fun findByCode(code: String): Optional<Product>
}