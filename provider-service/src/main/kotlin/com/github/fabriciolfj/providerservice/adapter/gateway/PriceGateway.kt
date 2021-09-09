package com.github.fabriciolfj.providerservice.adapter.gateway

import com.github.fabriciolfj.providerservice.adapter.repository.ProductRepository
import com.github.fabriciolfj.providerservice.adapter.repository.mapper.ProductPriceEntityMapper
import com.github.fabriciolfj.providerservice.business.ListPrices
import com.github.fabriciolfj.providerservice.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PriceGateway : ListPrices{

    @Autowired
    private lateinit var productRepository: ProductRepository

    override fun findPrices(code: String): List<Product> {
        return productRepository.findByCode(code)
            .map { ProductPriceEntityMapper.toDomain(it) }
    }
}