package com.miyajan.testtracker.web

import com.miyajan.testtracker.github.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.util.UriComponentsBuilder

@Controller
class Controller {
    @Autowired
    lateinit var auth2RestTemplate: OAuth2RestTemplate

    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    @GetMapping("/repos")
    fun repos(model: Model): String {
        val uri = UriComponentsBuilder.fromUriString("https://api.github.com/user/repos").build().toUri()
        model.addAttribute("repos", auth2RestTemplate.getForEntity(uri, Array<Repository>::class.java).body)
        return "repos"
    }
}
