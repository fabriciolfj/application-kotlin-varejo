package com.github.fabriciolfj.compraservice.business

import com.github.fabriciolfj.compraservice.domain.Product

interface SaveProduct {

    fun save(product: Product)
}