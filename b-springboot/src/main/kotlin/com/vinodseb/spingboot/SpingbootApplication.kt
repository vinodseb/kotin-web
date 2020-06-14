package com.vinodseb.spingboot

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpingbootApplication

fun main(args: Array<String>) {
    runApplication<SpingbootApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
