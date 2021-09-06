package com.github.fabriciolfj.compraservice.infrastructure

import com.github.fabriciolfj.compraservice.adapter.controller.ProductController
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductRequest
import com.github.fabriciolfj.compraservice.adapter.controller.dto.ProductResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/products")
class ProductInfraestructure {

    @Autowired
    private lateinit var controller: ProductController

    @PostMapping
    fun create(@Valid @RequestBody request: ProductRequest) : ProductResponse {
        return controller.execute(request)
    }
}