package com.github.fabriciolfj.compraservice.domain

import java.time.LocalDateTime

data class StockExtract(val quantity: Int, val exit: Int, val entry: Int, val date: LocalDateTime, val detail: String)