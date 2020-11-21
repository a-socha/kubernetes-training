package com.asocha.kubernetes.training.producer.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random.Default.nextInt

@RestController
@RequestMapping("/numbers")
class NumbersController {

    @GetMapping("random")
    fun getContent() = nextInt()

}