package com.github.fabriciolfj.demo.dsl.server


class Server {

    var port: Int = 8080;
    var host: String = "localhost"
    private val routes = mutableListOf<Route>()

    fun route(path: String, init: Route.() -> Unit) {
        val route = Route(path)
        route.init()
        routes.add(route)
    }

    fun start() {
        println("servidor iniciado em $host:$port")
        routes.forEach { route ->
            println("rota configurada: ${route.path}")
            route.handlers.forEach { (method, handler) ->
                println("$method -> $handler")
            }

        }
    }
}

class Route(val path: String) {
    val handlers = mutableMapOf<String, String>()

    fun get(handler: String) {
        handlers["GET"] = handler
    }

    fun post(handler: String) {
        handlers["POST"] = handler
    }

    fun put(handler: String) {
        handlers["PUT"] = handler
    }

    fun delete(handler: String) {
        handlers["DELETE"] = handler
    }
}

fun server(init: Server.() -> Unit): Server {
    val server = Server()
    server.init()
    return server
}

fun main() {
    val server = server {
        host = "127.0.0.1"
        port = 9090

        route("/api/cards") {
            get("getCardHandler")
            put("updateCardHandler")
            delete("deleteCardHandler")
        }
    }

    server.start()
}