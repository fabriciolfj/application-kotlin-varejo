package com.github.fabriciolfj.compraservice.adapter.controller.dto

import com.github.fabriciolfj.compraservice.domain.Product
import org.springframework.stereotype.Component

@Component
class ProductMapper {

    fun toDomain(request: ProductRequest) =
        Product(request.describe, request.price)

    fun toResponse(code: String) =
        ProductResponse(code)
}