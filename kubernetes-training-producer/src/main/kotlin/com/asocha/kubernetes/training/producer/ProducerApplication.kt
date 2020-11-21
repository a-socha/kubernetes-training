package com.asocha.kubernetes.training.producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerApplication

fun main(vararg args: String) {
    runApplication<ProducerApplication>(*args)
}