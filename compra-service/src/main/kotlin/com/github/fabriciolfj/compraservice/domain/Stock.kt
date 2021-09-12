package com.github.fabriciolfj.compraservice.domain

import java.time.LocalDateTime

data class Stock(val product: String, val quantity: Int, val order: String, val extracts: List<StockExtract>)