package com.github.fabriciolfj.compraservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableFeignClients(basePackages = ["com.github.fabriciolfj.compraservice.adapter.providers.http"])
@ComponentScan(basePackages= ["com.github.fabriciolfj.compraservice"])
@EnableJpaRepositories(basePackages = ["com.github.fabriciolfj.compraservice.adapter.providers.repository"])
@EntityScan(basePackages = ["com.github.fabriciolfj.compraservice.adapter.providers.repository.entity"])
class CompraServiceApplication

fun main(args: Array<String>) {
	runApplication<CompraServiceApplication>(*args)
}
