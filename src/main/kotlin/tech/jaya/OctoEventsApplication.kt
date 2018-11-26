package tech.jaya

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication(scanBasePackages = arrayOf("tech.jaya.*"))
open class OctoEventsApplication

fun main(args: Array<String>) {
    SpringApplication.run(OctoEventsApplication::class.java, *args)
}

