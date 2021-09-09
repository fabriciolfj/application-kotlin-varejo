package com.github.fabriciolfj.compraservice.adapter.providers.repository.entity

import javax.persistence.*

@Entity
@Table(name = "product")
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    @Column(name = "describe_name")
    val describe: String,
    val code: String,
    @OneToMany(cascade = [CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE], mappedBy = "productEntity")
    var prices: List<ProductPriceEntity>) {

    constructor() : this(0L, "", "", emptyList())
}