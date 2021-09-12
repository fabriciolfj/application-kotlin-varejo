package com.github.fabriciolfj.compraservice.domain

data class Stock(val product: String, val quantity: Int, val order: String, val extracts: List<StockExtract>)