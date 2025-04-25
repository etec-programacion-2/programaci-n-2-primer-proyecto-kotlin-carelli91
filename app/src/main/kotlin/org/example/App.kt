
package org.example

//PASO 1
fun mostrarNombreyFecha() {
    val nombre: String = "Gonza"
    val fecha: String = "22/04/25"

    println("Nombre: $nombre")
    println("Fecha: $fecha")
}

//PASO 2
fun mostrarTiposDeDatos() {
    val nombre: String = "Gonza"
    val edad: Int = 16
    val altura: Double = 1.78
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")

    fun calcularAreaRectangulo(base: Double, altura: Double) {
        val area = base * altura
        println("El área del rectángulo es: $area")
    }
}

fun main() {
    //PASO 1
    mostrarNombreyFecha()

    //PASO 2
    mostrarTiposDeDatos()

}
