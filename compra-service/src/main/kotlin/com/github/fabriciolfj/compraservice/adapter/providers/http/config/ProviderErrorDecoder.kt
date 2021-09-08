package com.github.fabriciolfj.compraservice.adapter.providers.http.config

import feign.Response
import feign.codec.ErrorDecoder
import java.lang.Exception
import java.lang.RuntimeException

class ProviderErrorDecoder : ErrorDecoder {

    override fun decode(msg: String?, response: Response?): Exception {
        throw RuntimeException(msg)
    }
}