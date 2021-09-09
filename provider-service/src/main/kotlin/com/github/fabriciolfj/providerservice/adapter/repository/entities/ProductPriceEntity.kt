package com.github.fabriciolfj.providerservice.adapter.repository.entities

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "product_price")
data class ProductPriceEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long?,
    var code: String,
    var price: BigDecimal,
    var provider: String,
    @Column(name = "date_update")
    var dateUpdate: LocalDate) {

    constructor() : this(null, "", BigDecimal.ZERO, "", LocalDate.now())
}