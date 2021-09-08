package com.github.fabriciolfj.compraservice.adapter.providers.http.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ProviderFeignConfig {

    @Bean
    fun providerError() : ProviderErrorDecoder {
        return ProviderErrorDecoder()
    }
}