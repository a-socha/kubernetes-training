package com.asocha.kubernetes.training.consumer.api

import com.asocha.kubernetes.training.consumer.service.ProducerApiClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("producer")
class ProducerVersionController(
        private val producerApiClient: ProducerApiClient
) {
    @GetMapping("version")
    fun getTestProperty() = producerApiClient.getVersion()
}