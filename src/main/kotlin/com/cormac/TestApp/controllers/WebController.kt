package com.cormac.TestApp.controllers

import org.springframework.web.bind.annotation.RequestAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * Created by cormaclavery on 07/07/2017.
 */

@RestController
class WebController {

    @RequestMapping("/test")
    fun test() : String {
        return "Test"
    }

    @RequestMapping("/")
    fun test2() : String{
        return "Hello World!!!!"
    }

}