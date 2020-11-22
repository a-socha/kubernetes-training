package com.asocha.kubernetes.training.consumer.api

import com.asocha.kubernetes.training.consumer.numbers.NumbersService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/numbers")
class MultiplyNumbersController(
        private val numbersService: NumbersService
) {
    @GetMapping("multiply")
    fun multiplyRandomBy(@RequestParam(name = "multiplier") multiplier: Int) =
            numbersService.multiplyRandomNumberBy(multiplier)
}
