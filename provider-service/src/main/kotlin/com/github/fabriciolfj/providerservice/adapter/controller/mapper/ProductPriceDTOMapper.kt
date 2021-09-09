package com.github.fabriciolfj.providerservice.adapter.controller.mapper

import com.github.fabriciolfj.providerservice.adapter.controller.dto.response.ProductPriceResponse
import com.github.fabriciolfj.providerservice.domain.Product

class ProductPriceDTOMapper {

    companion object {

        fun toResponse(product: Product) : ProductPriceResponse {
            return ProductPriceResponse(price = product.price, provider = product.provider, dateUpdate = product.date)
        }
    }
}