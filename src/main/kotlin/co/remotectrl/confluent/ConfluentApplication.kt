package co.remotectrl.confluent

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsoleApplication : CommandLineRunner {

    private val log = LoggerFactory.getLogger(ConsoleApplication::class.java)


    override fun run(vararg args: String?) {
        log.info("blah")
    }
}

fun main(args: Array<String>) {
    runApplication<ConsoleApplication>(*args)
}
