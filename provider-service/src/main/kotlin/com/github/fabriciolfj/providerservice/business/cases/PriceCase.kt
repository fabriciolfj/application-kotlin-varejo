package com.github.fabriciolfj.providerservice.business.cases

import com.github.fabriciolfj.providerservice.business.ListPrices
import com.github.fabriciolfj.providerservice.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class PriceCase {

    @Autowired
    private lateinit var listPrices: ListPrices

    fun execute(code: String) : List<Product> {
        return listPrices.findPrices(code)
            .ifEmpty { throw RuntimeException("Prices not found to product $code") }
    }
}