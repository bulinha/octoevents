package tech.jaya.webhook


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import org.springframework.web.bind.annotation.RestController

@RestController
open class WebHookController {

    //@RequestMapping(path=arrayOf("/payload"), name="payload", method = arrayOf(RequestMethod.GET))
    @GetMapping("/payload")
    fun payload():String {
        print("chamou o payload")
        return "eita porra"
    }
}