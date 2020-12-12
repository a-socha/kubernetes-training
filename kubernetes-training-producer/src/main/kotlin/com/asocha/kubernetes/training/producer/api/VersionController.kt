package com.asocha.kubernetes.training.producer.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("version")
class VersionController(
        @Value("\${producer.version}") private val version: String
) {

    @GetMapping
    fun getVersion() = version

}