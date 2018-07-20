package uk.co.lewisjefferies.bank

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("rest")
class HtmlController {

    @PostMapping("/hello")
    fun helloString(): String {
        return "Hello"
    }

    //Head to http://localhost:8080/rest/hello to what it returns.

}