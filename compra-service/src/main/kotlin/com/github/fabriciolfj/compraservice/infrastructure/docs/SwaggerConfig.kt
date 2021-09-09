package com.github.fabriciolfj.compraservice.infrastructure.docs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun docketApi() : Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.github.fabriciolfj.compraservice.infrastructure"))
            .paths(PathSelectors.ant("/api/**"))
            .build()
            .apiInfo(getApiInfo())
    }

    private fun getApiInfo(): ApiInfo? {
        return ApiInfo(
            "Compras",
            "Gerenciador de compras",
            javaClass.getPackage().implementationVersion,
            null,
            null,
            null,
            null, emptyList()
        )
    }
}