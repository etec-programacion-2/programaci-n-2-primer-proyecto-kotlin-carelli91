
package org.example

class App {
    val greeting: String
        get() {
            return "Gonzalo Carelli, 22/04/25"
        }
}

fun main() {
    println(App().greeting)
}
