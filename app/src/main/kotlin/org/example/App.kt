
package org.example


/////////////////////        PASO 1             /////////////////////
fun mostrarNombreyFecha() {
    val nombre: String = "Gonza"
    val fecha: String = "25/04/25"

    println("Nombre: $nombre")
    println("Fecha: $fecha")
}


/////////////////////        PASO 2             /////////////////////
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

fun calcularAreaRectangulo(base: Double, altura: Double) {
    val area = base * altura
    println("El área del rectángulo es: $area")
}


/////////////////////        PASO 3             /////////////////////
fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

fun esNegativoPositivo(numero:Int): String {
    return when {
        numero < 0 -> "Negativo"
        numero > -1 -> "Positivo"
        else -> "Cero"
    }
}


/////////////////////        PASO 4             /////////////////////
fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

fun mostrarParesConLoops() {
    println("Usando for loop:")
    for (i in 2..20 step 2) {
        print("$i ")
    }

    println("\n\nUsando while loop:")
    var j = 2
    while (j <= 20) {
        print("$j ")
        j += 2
    }

    println("\n\nUsando do-while loop:")
    var k = 2
    do {
        print("$k ")
        k += 2
    } while (k <= 20)

    println("\n") // salto de línea final
}




fun main() {
    //PASO 1
    println("///////PASO 1///////")
    mostrarNombreyFecha()

    //PASO 2
    println("///////PASO 2///////")
    mostrarTiposDeDatos()
    calcularAreaRectangulo(5.5, 3.0)

    //PASO 3
    println("///////PASO 3///////")
    println(esParOImpar(5))
    println(esNegativoPositivo(-4))

    //PASO 4
    println("///////PASO 4///////")
    mostrarNumerosConLoops()
    mostrarParesConLoops()
}
