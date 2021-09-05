package com.github.fabriciolfj.compraservice.domain

import java.math.BigDecimal

data class Product(var code: String? = null, val describe: String, val price: BigDecimal) {

    constructor(describe: String, price: BigDecimal) : this(null, describe, price)
}