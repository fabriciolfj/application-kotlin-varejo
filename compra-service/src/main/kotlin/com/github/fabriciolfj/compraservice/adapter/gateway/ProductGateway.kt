package com.github.fabriciolfj.compraservice.adapter.gateway

import com.github.fabriciolfj.compraservice.adapter.providers.http.ProviderPricesMapper
import com.github.fabriciolfj.compraservice.adapter.providers.http.client.ProviderClient
import com.github.fabriciolfj.compraservice.adapter.providers.repository.ProductPriceRepository
import com.github.fabriciolfj.compraservice.adapter.providers.repository.ProductRepository
import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductEntity
import com.github.fabriciolfj.compraservice.adapter.providers.repository.mapper.ProductEntityMapper
import com.github.fabriciolfj.compraservice.business.FindProduct
import com.github.fabriciolfj.compraservice.business.SaveProduct
import com.github.fabriciolfj.compraservice.domain.Product
import com.github.fabriciolfj.compraservice.domain.ProductPrice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Component
class ProductGateway : SaveProduct, FindProduct {

    @Autowired
    private lateinit var productRepository: ProductRepository
    @Autowired
    private lateinit var productPriceRepository: ProductPriceRepository
    @Autowired
    private lateinit var providerHttp: ProviderClient

    @Transactional(propagation = Propagation.REQUIRED)
    override fun save(product: Product) {
        val entityBase = productRepository.findByCode(product.code);

        entityBase.map { entityPersited ->
            productPriceRepository.deleteAllByProduct(entityPersited.id!!)
            var entityPrices = ProductEntityMapper.toEntityPrices(product.prices, entityPersited)
            entityPersited.prices = entityPrices
            productRepository.save(entityPersited)
        }.orElseGet {
            val entity = ProductEntityMapper.toEntity(product)
            productRepository.save(entity)
        }
    }
    override fun findByCode(code: String): Optional<Product> {
        return productRepository.findByCode(code)
            .map {
                ProductEntityMapper.toDomain(it)
            }
    }

    override fun findPrices(code: String) : List<ProductPrice> {
        var prices = providerHttp.findPrices(code)
        return ProviderPricesMapper.toDomain(prices)
    }

}