package com.nicoljbv.fundamentoskotlin.retoV
import kotlin.random.Random
class RetoV {
}

fun main() {
    val telefono:Int=1234567890
    val contrasena:Int=1234
    var saldodis:Int=4500
    var intentos:Int=3

    for(i in 1..intentos) {
        println("Bienvenido a Nequi \nIngrese su número de teléfono")
        var inicioSesionT: Int = readLine()!!.toInt()
        println("Ingrese su contraseña")
        var inicioSesionC: Int = readLine()!!.toInt()

        if (inicioSesionT == telefono && inicioSesionC == contrasena) {
            do {
                println("Usted desea: \n1.Sacar \n2.Enviar \n3.Recargar \n4.Cerrar Sesión")
                var funcionalidad: String = readLine()!!.toString().lowercase()

                when (funcionalidad) {
                    "1", "sacar" -> {
                        println("Desea retirar dinero de: 1.Cajero o 2.Punto Fisíco")
                        var eleccion: String = readLine()!!.toString().lowercase()

                        if (saldodis >= 2000) {
                            println("Cuánto dinero desea retirar")
                            var retiro: Int = readLine()!!.toInt()
                            if (retiro <= saldodis) {
                                var codigo = Random.nextInt(100000, 1000000)
                                println("Retire en un ${eleccion} con el siguiente código ${codigo}")
                                saldodis = saldodis - retiro
                            } else {
                                println("El valor que quiere retirar supera su saldo disponible")
                            }
                        } else {
                            println("No te alcanza")
                        }
                        println("Saldo disponible: $${saldodis}")

                    }

                    "2", "enviar" -> {
                        println("Digite el número de teléfono al que desea enviar dinero")
                        var telEnviar: Int = readLine()!!.toInt()
                        println("Ingrese el valor que quiere enviar")
                        var valorEnviar: Int = readLine()!!.toInt()

                        if (valorEnviar < saldodis) {
                            println("Usted va a enviar $${valorEnviar} al número de teléfono ${telEnviar}")
                            saldodis = saldodis - valorEnviar
                        } else {
                            println("No es posible enviar esa cantidad de dinero ")
                        }
                        println("Saldo disponible: $${saldodis}")
                    }

                    "3", "recargar" -> {
                        println("Ingrese el valor que quiere recargar")
                        var valorRecarga: Int = readLine()!!.toInt()

                        println("Desea recargar ${valorRecarga} a su cuenta de Nequi, si o no")
                        var confirmar: String = readLine()!!.toString().lowercase()

                        if (confirmar.equals("si")) {
                            saldodis = saldodis + valorRecarga
                            println("Saldo disponible: ${saldodis}")
                        } else {
                            println("La cuenta no se recargo")
                        }
                    }

                    "4", "cerrar sesion" -> {
                        println("Cerrando Sesión...")
                        break
                    }

                    else -> println("Ingreso una funcionalidad incorrecta")
                }

                println("Desea realizar otra funcionalidad en Nequi")
                var resp: String = readLine()!!.toString().lowercase()

            } while (resp.equals("si"))
            break
        } else {
            println("Teléfono o contraseña incorrectos, intente de nuevo")
            intentos--
        }
    }
}