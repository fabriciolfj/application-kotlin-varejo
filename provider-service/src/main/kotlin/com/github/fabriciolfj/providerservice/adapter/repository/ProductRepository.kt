package com.github.fabriciolfj.providerservice.adapter.repository

import com.github.fabriciolfj.providerservice.adapter.repository.entities.ProductPriceEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<ProductPriceEntity, Long> {

    fun findByCode(code: String) : List<ProductPriceEntity>
}