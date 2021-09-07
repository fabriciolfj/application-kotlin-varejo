package com.github.fabriciolfj.compraservice.adapter.controller.dto

import javax.validation.constraints.NotBlank

data class ProductRequest(
    @field:NotBlank(message = "Describe not abandonment")
    val describe: String)