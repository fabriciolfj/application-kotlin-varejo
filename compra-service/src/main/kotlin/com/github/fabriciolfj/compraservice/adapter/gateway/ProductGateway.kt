package com.github.fabriciolfj.compraservice.adapter.gateway

import com.github.fabriciolfj.compraservice.adapter.providers.repository.ProductRepository
import com.github.fabriciolfj.compraservice.adapter.providers.repository.mapper.ProductEntityMapper
import com.github.fabriciolfj.compraservice.business.FindProduct
import com.github.fabriciolfj.compraservice.business.SaveProduct
import com.github.fabriciolfj.compraservice.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProductGateway : SaveProduct, FindProduct {

    @Autowired
    private lateinit var productRepository: ProductRepository

    override fun save(product: Product) {
        val entity = ProductEntityMapper.toEntity(product)
        productRepository.save(entity)
    }

    override fun findByCode(code: String): Optional<Product> {
        return productRepository.findByCode(code)
            .map { ProductEntityMapper.toDomain(it) }
    }

}