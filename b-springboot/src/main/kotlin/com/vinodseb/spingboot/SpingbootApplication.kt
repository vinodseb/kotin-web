package com.vinodseb.spingboot

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class SpingbootApplication

fun main(args: Array<String>) {
	runApplication<SpingbootApplication>(*args)
}
