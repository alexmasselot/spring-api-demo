package com.loccitane.api.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
@author Alexandre Masselot
@Copyright L'Occitane 2022
 */
@RestController
class HelloController {
    @GetMapping("/greeting")
    fun home(): String {
        return "paf le chien"
    }
}
