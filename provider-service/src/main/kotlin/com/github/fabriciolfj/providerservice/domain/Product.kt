package com.github.fabriciolfj.providerservice.domain

import java.math.BigDecimal
import java.time.LocalDate

data class Product(val code: String, val price: BigDecimal, val date: LocalDate, val provider: String)