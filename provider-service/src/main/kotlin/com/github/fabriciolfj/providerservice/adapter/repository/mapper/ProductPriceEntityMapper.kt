package com.github.fabriciolfj.providerservice.adapter.repository.mapper

import com.github.fabriciolfj.providerservice.adapter.repository.entities.ProductPriceEntity
import com.github.fabriciolfj.providerservice.domain.Product


class ProductPriceEntityMapper {

    companion object {

        fun toDomain(entity: ProductPriceEntity) : Product {
            return Product(entity.code, entity.price, entity.dateUpdate, entity.provider)
        }
    }
}