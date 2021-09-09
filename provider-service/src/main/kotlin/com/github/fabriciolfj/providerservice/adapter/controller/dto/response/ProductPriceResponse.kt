package com.github.fabriciolfj.providerservice.adapter.controller.dto.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDate

data class ProductPriceResponse(val price: BigDecimal, val provider: String,
                                @JsonProperty(value = "date_update")
                                val dateUpdate: LocalDate)