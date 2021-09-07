package com.github.fabriciolfj.compraservice.domain

import java.math.BigDecimal
import java.time.LocalDate

data class ProductPrice(val provider: String, val price: BigDecimal, val date: LocalDate)