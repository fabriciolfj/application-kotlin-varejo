package com.github.fabriciolfj.compraservice.domain

import java.math.BigDecimal
import java.time.LocalDateTime

data class PurchaseOrder(val provider: String,
                         val date: LocalDateTime,
                         val total: BigDecimal,
                         val quantity: Int,
                         val volume: Int,
                         val status: OrderStatus,
                         val type: TypeOrder,
                         val items: List<PurchaseOrderItems>)