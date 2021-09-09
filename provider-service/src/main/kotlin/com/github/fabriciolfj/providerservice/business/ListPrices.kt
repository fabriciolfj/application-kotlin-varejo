package com.github.fabriciolfj.providerservice.business

import com.github.fabriciolfj.providerservice.domain.Product

interface ListPrices {

    fun findPrices(code: String) : List<Product>
}