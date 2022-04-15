package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.application.*
import org.koin.ktor.ext.Koin

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(Koin) {
            modules()
        }
        configureMonitoring()
        configureRouting()
        configureSerialization()
        configureHTTP()
    }.start(wait = true)
}
