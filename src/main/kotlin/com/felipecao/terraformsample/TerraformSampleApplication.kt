package com.felipecao.terraformsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TerraformSampleApplication

fun main(args: Array<String>) {
	runApplication<TerraformSampleApplication>(*args)
}
