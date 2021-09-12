package com.github.fabriciolfj.compraservice.domain

import java.math.BigDecimal

data class PurchaseOrderItems(val product: String, val quantity: Integer, val total: BigDecimal, val tax: BigDecimal)