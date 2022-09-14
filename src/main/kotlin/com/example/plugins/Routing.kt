package com.example.plugins

import com.example.routes.customerRouting
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {

        get("/") {
            call.respondText("welcome",status = HttpStatusCode.OK)
        }

        customerRouting()
    }
}
