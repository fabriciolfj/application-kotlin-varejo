package com.github.fabriciolfj.compraservice.adapter.providers.http.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDate

data class ProviderPricesDTO(val provider: String, val price: BigDecimal,
                             @JsonProperty("date_update")
                             val date: LocalDate)