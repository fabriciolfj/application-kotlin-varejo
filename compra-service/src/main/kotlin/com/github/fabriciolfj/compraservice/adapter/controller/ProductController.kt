package com.github.fabriciolfj.compraservice.adapter.controller

import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductMapper
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductPricesResponse
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductRequest
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductResponse
import com.github.fabriciolfj.compraservice.business.case.ProductCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProductController {

    @Autowired
    private lateinit var productCase: ProductCase
    @Autowired
    private lateinit var mapper: ProductMapper

    fun execute(productRequest: ProductRequest) : ProductResponse {
        val domain = productCase.execute(mapper.toDomain(productRequest))
        return domain.run { mapper.toResponse(this) }
    }

    fun findPrices(code: String) : List<ProductPricesResponse> {
        val domain = productCase.execute(code)
        return domain.prices.map { mapper.toResponsePrice(code, it) }.toList()
    }
}