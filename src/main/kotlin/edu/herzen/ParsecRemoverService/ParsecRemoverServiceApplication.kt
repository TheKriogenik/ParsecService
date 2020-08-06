package edu.herzen.ParsecRemoverService

import com.google.gson.Gson
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
class ParsecRemoverServiceApplication{

	@Bean
	fun gson(): Gson {
		return Gson()
	}

}

fun main(args: Array<String>) {
    val ctx = runApplication<ParsecRemoverServiceApplication>(*args)
}
