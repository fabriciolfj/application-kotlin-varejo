package com.github.fabriciolfj.providerservice.infrastructure

import com.github.fabriciolfj.providerservice.adapter.controller.ProductPriceController
import com.github.fabriciolfj.providerservice.adapter.controller.dto.response.ProductPriceResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/providers")
class InfraSpringProductController {

    @Autowired
    private lateinit var controller: ProductPriceController

    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun findPrices(@PathVariable("code") code: String) : List<ProductPriceResponse> {
        return controller.findPrices(code)
    }
}