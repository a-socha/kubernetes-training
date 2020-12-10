package com.asocha.kubernetes.training.consumer.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CheckPropertyController(
        @Value("\${configmap.property}") private val testProperty: String
) {
    @GetMapping("properties")
    fun getTestProperty() = testProperty
}