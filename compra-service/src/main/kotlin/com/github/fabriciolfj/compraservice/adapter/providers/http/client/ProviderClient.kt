package com.github.fabriciolfj.compraservice.adapter.providers.http.client

import com.github.fabriciolfj.compraservice.adapter.providers.http.config.ProviderFeignConfig
import com.github.fabriciolfj.compraservice.adapter.providers.http.dto.ProviderPricesDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "providers", url = "\${url.providers}", configuration = [ProviderFeignConfig::class])
interface ProviderClient {

    @GetMapping("/{code}")
    fun findPrices(@PathVariable("code") code: String) : List<ProviderPricesDTO>
}