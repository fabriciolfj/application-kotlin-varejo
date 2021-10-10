package com.github.fabriciolfj.compraservice.adapter.controller.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class ProductRequest(
    @field:NotBlank(message = "Describe not abandonment")
    val describe: String,
    @field:NotNull(message = "Price not null")
    val code: String,
    @field:NotBlank(message = "Classification not null")
    val classification: String)