package com.cormac.TestApp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TestAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(TestAppApplication::class.java, *args)
}
