package com.github.fabriciolfj.compraservice.adapter.providers.repository.entity

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "product_provider")
data class ProductPriceEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var price: BigDecimal,
    var provider: String,
    @Column(name = "last_date")
    val lastDate: LocalDate,
    @ManyToOne
    @JoinColumn(name = "product_id")
    var productEntity: ProductEntity) {

    constructor() : this(0L, BigDecimal.ZERO, "", LocalDate.now(), ProductEntity())
}