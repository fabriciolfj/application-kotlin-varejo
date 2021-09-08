package com.github.fabriciolfj.compraservice.adapter.providers.http.dto

import java.math.BigDecimal
import java.time.LocalDate

data class ProviderPricesDTO(val provider: String, val price: BigDecimal, val date: LocalDate)