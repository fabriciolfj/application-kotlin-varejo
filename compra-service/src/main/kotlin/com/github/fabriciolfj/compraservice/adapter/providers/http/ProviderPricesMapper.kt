package com.github.fabriciolfj.compraservice.adapter.providers.http

import com.github.fabriciolfj.compraservice.adapter.providers.http.dto.ProviderPricesDTO
import com.github.fabriciolfj.compraservice.domain.ProductPrice

class ProviderPricesMapper {

    companion object {
        fun toDomain(providers: List<ProviderPricesDTO>) : List<ProductPrice> {
            return providers
                    .map { ProductPrice(it.provider, it.price, it.date) }
                .toList()
        }
    }
}