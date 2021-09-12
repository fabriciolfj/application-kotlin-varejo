package com.github.fabriciolfj.compraservice.domain

data class Product(var code: String, val describe: String, var prices: List<ProductPrice>, val classification: String) {

    constructor(code: String, describe: String) : this(code, describe, emptyList(), "")
}