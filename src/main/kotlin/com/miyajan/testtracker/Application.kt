package com.miyajan.testtracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.oauth2.client.OAuth2ClientContext
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails

@SpringBootApplication
@EnableWebSecurity
@EnableOAuth2Sso
class Application {
    @Bean
    fun oauth2RestTemplate(
        oAuth2ClientContext: OAuth2ClientContext,
        details: OAuth2ProtectedResourceDetails
    ): OAuth2RestTemplate {
        return OAuth2RestTemplate(details, oAuth2ClientContext)
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
