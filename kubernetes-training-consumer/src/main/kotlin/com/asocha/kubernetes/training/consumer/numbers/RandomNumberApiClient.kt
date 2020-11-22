package com.asocha.kubernetes.training.consumer.numbers

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMethod.GET

@FeignClient("random-number-service")
interface RandomNumberApiClient {
    @RequestMapping(method = [GET], path = ["numbers/random"])
    fun getRandomInteger(): Int

}