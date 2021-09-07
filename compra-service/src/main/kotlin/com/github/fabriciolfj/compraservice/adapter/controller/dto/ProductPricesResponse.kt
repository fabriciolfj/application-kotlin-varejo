package com.github.fabriciolfj.compraservice.adapter.controller.dto

import java.math.BigDecimal
import java.time.LocalDate

data class ProductPricesResponse(val code: String, val price: BigDecimal, val provider: String, val date: LocalDate)