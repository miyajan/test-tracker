package com.miyajan.testtracker.github

import com.fasterxml.jackson.annotation.JsonProperty

class Repository {
    lateinit var name: String
    @JsonProperty("html_url")
    lateinit var htmlUrl: String
}
