package com.github.fabriciolfj.compraservice.infrastructure

import com.github.fabriciolfj.compraservice.adapter.controller.ProductController
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductRequest
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.validation.constraints.NotBlank

@RestController
@RequestMapping("/api/v1/products")
class ProductInfraestructure {

    @Autowired
    private lateinit var controller: ProductController

    @PostMapping
    fun create(@Valid @RequestBody request: ProductRequest) : ProductResponse {
        return controller.execute(request)
    }

    @GetMapping("/prices/{code}")
    fun find(@PathVariable("code") @NotBlank(message = "Code not informed") code: String)  =
        controller.findPrices(code)
}