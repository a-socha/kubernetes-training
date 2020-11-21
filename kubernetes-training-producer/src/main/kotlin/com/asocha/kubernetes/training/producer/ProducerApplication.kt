package com.asocha.kubernetes.training.producer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ProducerApplication

fun main(vararg args: String) {
    SpringApplication(ProducerApplication::class.java).run(*args)
}