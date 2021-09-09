package com.github.fabriciolfj.compraservice.adapter.providers.repository.mapper

import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductEntity
import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductPriceEntity
import com.github.fabriciolfj.compraservice.domain.Product
import com.github.fabriciolfj.compraservice.domain.ProductPrice

class ProductEntityMapper {

    companion object {
        fun toEntity(domain: Product) : ProductEntity {
            return domain.run {
                var entity = ProductEntity(null, this.describe, this.code!!, emptyList())
                var prices = toEntityPrices(domain.prices, entity)
                entity.prices = prices
                entity
            }
        }

        fun toDomain(entity: ProductEntity) : Product {
            return entity.run {
                val productPrices = this.prices.map { ProductPrice(it.provider, it.price, it.lastDate) }.toList()
                Product(this.code, this.describe, productPrices)
            }
        }

        fun toEntityPrices(prices: List<ProductPrice>, entity: ProductEntity) : List<ProductPriceEntity> {
            return prices.map { ProductPriceEntity(null, it.price, it.provider, it.date, entity) }
        }
    }
}