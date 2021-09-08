package com.github.fabriciolfj.compraservice.adapter.controller.dto

import com.github.fabriciolfj.compraservice.domain.Product
import com.github.fabriciolfj.compraservice.domain.ProductPrice
import org.springframework.stereotype.Component

@Component
class ProductMapper {

    fun toDomain(request: ProductRequest) =
        Product(request.code, request.describe)

    fun toResponse(code: String) =
        ProductResponse(code)

    fun toResponsePrice(code: String, productPrice: ProductPrice) =
        ProductPricesResponse(code, productPrice.price, productPrice.provider, productPrice.date)
}