package com.nicoljbv.fundamentoskotlin.retoII

class RetoII {
    fun mostrarCanciones(cancion: MutableList<MutableList<Any>>) {
        for (i in 0 until cancion.size) {
            println("${cancion[i][0]}, interpretada por ${cancion[i][1]}, se lanzó en el año ${cancion[i][2]} y cuenta con ${cancion[i][3]} reproducciones.")
        }
    }
}

fun main() {
    var cancion = mutableListOf<MutableList<Any>>()

    println("¿Cuál es el nombre del album?")
    var nombreAlbum:String= readLine()!!.toString()
    println("¿Cuántas canciones tiene el album?")
    var numCancion:Int= readLine()!!.toInt()

    for (i in 1..numCancion){
        println("Canción #${i} \nIngrese el titulo")
        var nombreC:String= readLine()!!.toString()
        println("Ingrese el nombre del artista")
        var artista:String= readLine()!!.toString()
        println("Ingrese la fecha de publicación")
        var fpubli:String= readLine()!!.toString()
        println("Ingrese el número de reproducciones")
        var reproduccion:Int= readLine()!!.toInt()
        cancion.add(mutableListOf(nombreC,artista,fpubli,reproduccion))
    }

    var popular:Int=1000
    for (i in 0 until cancion.size) {
        var numReproP = cancion[i][3] as Int
        if (numReproP>= popular) {
            println("${cancion[i][0]} es una canción popular")
        }else{
            println("${cancion[i][0]} no es una canción popular")
        }
    }

    var mostrar= RetoII()
    mostrar.mostrarCanciones(cancion)
}