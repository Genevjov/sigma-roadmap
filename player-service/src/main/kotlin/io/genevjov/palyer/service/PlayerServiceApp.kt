package io.genevjov.palyer.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableAutoConfiguration
@EnableJpaRepositories
open class PlayerService

fun main(args: Array<String>) {
    SpringApplication.run(PlayerService::class.java, *args)
}