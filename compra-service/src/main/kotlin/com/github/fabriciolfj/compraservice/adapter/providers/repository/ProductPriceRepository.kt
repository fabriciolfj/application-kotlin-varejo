package com.github.fabriciolfj.compraservice.adapter.providers.repository

import com.github.fabriciolfj.compraservice.adapter.providers.repository.entity.ProductPriceEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ProductPriceRepository : JpaRepository<ProductPriceEntity, Long> {

    @Modifying
    @Query("delete from ProductPriceEntity e where e.productEntity.id = :id")
    fun deleteAllByProduct(@Param("id") id: Long)
}