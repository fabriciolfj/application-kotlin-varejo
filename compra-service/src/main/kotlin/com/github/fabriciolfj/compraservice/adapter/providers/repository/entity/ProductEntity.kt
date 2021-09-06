package com.github.fabriciolfj.compraservice.adapter.providers.repository.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "product")
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    @Column(name = "describe_name")
    val describe: String,
    val price: BigDecimal,
    val code: String
)