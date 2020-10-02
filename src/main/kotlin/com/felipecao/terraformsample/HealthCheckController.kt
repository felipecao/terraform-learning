package com.felipecao.terraformsample

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HealthCheckController {

    @GetMapping
    fun ping(): ResponseEntity<String> {
        return ResponseEntity.ok("Ping succeeded");
    }
}