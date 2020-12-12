package com.asocha.kubernetes.training.consumer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET

@FeignClient("producer-service")
interface ProducerApiClient {
    @RequestMapping(method = [GET], path = ["numbers/random"])
    fun getRandomInteger(): Int

    @RequestMapping(method = [GET], path = ["version"])
    fun getVersion(): Int

}