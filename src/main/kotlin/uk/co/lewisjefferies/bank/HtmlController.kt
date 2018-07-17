package uk.co.lewisjefferies.bank

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("rest")
class HtmlController {

    @GetMapping("/hello")
    fun helloString(): String {
        return "Hello"
    }

    //Head to http://localhost:8080/rest/hello to what it returns.

}