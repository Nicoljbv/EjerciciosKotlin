package com.nicoljbv.fundamentoskotlin.retoIII

class RetoIII {
}

fun main() {

    println("¿Desea ofertar un articulo?")
    var resp:String= readLine()!!.toString().lowercase()

    while (resp.equals("si")){
        var precios = mutableListOf<MutableList<Int>>()

        println("Ingrese el nombre del articulo que quiere ofertar")
        var nombre:String= readLine()!!.toString()
        println("Ingrese el precio base")
        var precioBase:Int= readLine()!!.toInt()

        println("Inicia la subasta")
        println("Alguien ofrece más de $${precioBase}")
        var subasta:String= readLine()!!.toString().lowercase()

        while (subasta.equals("si")){
            println("¿Cuánto?")
            var precio:Int= readLine()!!.toInt()
            precios.add(mutableListOf(precio))

            println("Alguien ofrece más de $${precio}")
            subasta= readLine()!!.toString().lowercase()
        }

        if (precios.isEmpty()) {
            println("No hubieron ofertas, el articulo se vende a la casa de subastas")
        } else {
            var precioMayor:Int=0
            for (precio in precios.indices) {
                if (precio > precioMayor) {
                    precioMayor = precio
                }
            }
            println("Articulo vendido por $${precioMayor}")
        }

        println("Desea ofertar otro articulo")
        resp= readLine()!!.toString().lowercase()


    }
}