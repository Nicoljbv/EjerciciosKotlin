package com.nicoljbv.fundamentoskotlin.RETOI

class RetoI {
}

fun main() {

    println("Ingrese la cantidad de teléfonos que tiene")
    var numTele:Int= readLine()!!.toInt()

    for (i in 1..numTele){
        println("Teléfono #${i+1}")
        println("Programa... \n¿Cuántas notificaciones recibió el teléfono #${i+1}")
        var notificacion:Int= readLine()!!.toInt()

        println("Usuario...")
        if (notificacion==0){
           println("No existen mensajes disponibles")
        }else if (notificacion<100){
            println("Recibió ${notificacion} notificaciones")
        }else{
            println("Recibió +99 notificaciones")
        }

    }

}