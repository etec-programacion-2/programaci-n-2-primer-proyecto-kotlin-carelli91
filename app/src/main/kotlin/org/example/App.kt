
package org.example


fun mostrarNombreyFecha() {
    val nombre: String = "Gonza"
    val fecha: String = "22/04/25"

    println("Nombre: $nombre")
    println("Fecha: $fecha")
}


fun mostrarTiposDeDatos() {
    val nombre: String = "Gonza"
    val edad: Int = 16
    val altura: Double = 1.78
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}


fun main() {
    mostrarNombreyFecha()

    mostrarTiposDeDatos()

}
