package com.github.fabriciolfj.providerservice.adapter.controller

import com.github.fabriciolfj.providerservice.adapter.controller.dto.response.ProductPriceResponse
import com.github.fabriciolfj.providerservice.adapter.controller.mapper.ProductPriceDTOMapper
import com.github.fabriciolfj.providerservice.business.cases.PriceCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProductPriceController {

    @Autowired
    private lateinit var priceCase: PriceCase

    fun findPrices(code: String) : List<ProductPriceResponse> {
        return priceCase.execute(code)
            .map { ProductPriceDTOMapper.toResponse(it) }
    }
}