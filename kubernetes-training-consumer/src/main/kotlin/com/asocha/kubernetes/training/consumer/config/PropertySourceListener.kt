package com.asocha.kubernetes.training.consumer.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.core.env.ConfigurableEnvironment
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@Component
class PropertySourceListener(
        private val env: Environment
) : ApplicationListener<ContextRefreshedEvent?> {

    override fun onApplicationEvent(event: ContextRefreshedEvent?) {
        (env as ConfigurableEnvironment?)
                ?.propertySources?.forEach { log.info(it.name) }
    }

    private val log: Logger = getLogger(PropertySourceListener::class.java)
}