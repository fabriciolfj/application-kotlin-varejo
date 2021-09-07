package com.github.fabriciolfj.compraservice.adapter.providers.http.dto

import java.math.BigDecimal

data class ProviderPricesDTO(val code: String, val provider: String, val price: BigDecimal)