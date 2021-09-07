package com.github.fabriciolfj.compraservice.domain

data class Product(var code: String? = null, val describe: String, val prices: List<ProductPrice>) {

    constructor(describe: String) : this(null, describe, emptyList())
}