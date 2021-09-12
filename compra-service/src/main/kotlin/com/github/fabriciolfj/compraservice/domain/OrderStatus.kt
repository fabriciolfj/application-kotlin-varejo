package com.github.fabriciolfj.compraservice.domain

import java.lang.IllegalArgumentException

enum class OrderStatus(val describe: String) {
    ACTIVE("active"),
    PENDING("pending"),
    CANCELED("canceled");

    companion object {
        fun toEnum(describe: String): OrderStatus {
            return values()
                    .filter { it.describe == describe }
                    .firstOrNull() ?: throw IllegalArgumentException("Status not found, to value $describe")
        }
    }
}