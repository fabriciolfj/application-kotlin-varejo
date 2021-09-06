package com.github.fabriciolfj.compraservice.adapter.providers.repository.mapper

import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductEntity
import com.github.fabriciolfj.compraservice.domain.Product

class ProductEntityMapper {

    companion object {
        fun toEntity(domain: Product) : ProductEntity {
            return domain.run {
                ProductEntity(null, this.describe, this.price, this.code!!)
            }
        }
    }
}