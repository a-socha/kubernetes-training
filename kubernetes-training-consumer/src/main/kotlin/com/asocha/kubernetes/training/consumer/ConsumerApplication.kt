package com.asocha.kubernetes.training.consumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ConsumerApplication

fun main(vararg args: String) {
    SpringApplication(ConsumerApplication::class.java).run(*args)
}