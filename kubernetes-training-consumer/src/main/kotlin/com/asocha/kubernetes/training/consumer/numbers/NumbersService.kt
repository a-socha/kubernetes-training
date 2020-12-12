package com.asocha.kubernetes.training.consumer.numbers

import com.asocha.kubernetes.training.consumer.service.ProducerApiClient
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
@Service
class NumbersService(
        private val producerApiClient: ProducerApiClient,
        @Value("\${kubernetes-training-producer.host}") private val host: String,
        @Value("\${kubernetes-training-producer.port}") private val port: String,
        @Value("\${producer-service.ribbon.listOfServers}") private val listOfServers: String
) {

    private val logger = LoggerFactory.getLogger(NumbersService::class.java)

    fun multiplyRandomNumberBy(multiplier: Int): MultiplyRandomResponse {
        logger.info("Host: $host")
        logger.info("port: $port")
        logger.info("listOfServers: $listOfServers")
        return MultiplyRandomResponse(
                randomNumber = producerApiClient.getRandomInteger(),
                multiplier = multiplier
        )
    }

}


data class MultiplyRandomResponse(
        val randomNumber: Int,
        val multiplier: Int
) {
    val result: Int
        get() = randomNumber * multiplier
}

