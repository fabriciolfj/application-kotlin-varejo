package com.github.fabriciolfj.compraservice.adapter.providers.repository

import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProductRepository : JpaRepository<ProductEntity, Long> {

    fun findByCode(code: String): Optional<ProductEntity>
}