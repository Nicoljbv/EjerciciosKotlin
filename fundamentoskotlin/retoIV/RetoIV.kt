package com.nicoljbv.fundamentoskotlin.retoIV

class RetoIV {
}

fun main() {
    var entrada = mutableListOf<MutableList<Any>>()
    var platoFuerte = mutableListOf<MutableList<Any>>()
    var postre = mutableListOf<MutableList<Any>>()
    var bebida = mutableListOf<MutableList<Any>>()

    do {
        println("Bienvenido, Elija un menú \n1.Entradas \n2.Platos Fuertes \n3.Postres \n3.Bebidas")
        var menu: String = readLine()!!.toString().lowercase()

        when (menu) {
            "1", "entradas" -> {
                println(
                    "Quiere: \n1.Agregar entradas al menú \n2.Visualizar las entradas existentes en el menú" +
                            " \n3.Visualizar una entrada especifica \n4.Modificar algún plato del menú \n5.Eliminar un plato del menú"
                )
                var accion: Int = readLine()!!.toInt()

                when (accion) {
                    1 -> {
                        println("1.Agregar entradas al menú")
                        println("Codigo del la entrada:")
                        var codEntrada: Int = readLine()!!.toInt()
                        println("Nombre del la entrada:")
                        var nombreEntrada: String = readLine()!!.toString()
                        println("Descripción del plato:")
                        var desc: String = readLine()!!.toString()
                        println("Precio del plato:")
                        var precioEntrada: Int = readLine()!!.toInt()
                        entrada.add(mutableListOf(codEntrada, nombreEntrada, desc, precioEntrada))
                    }

                    2 -> {
                        println("2.Visualizar las entradas existentes en el menú")
                        for (item in entrada.withIndex()) {
                            println(item)
                        }
                    }

                    3 -> {
                        println("Ingrese el codigo de la entrada que quiere visualizar")
                        var idE: Int = readLine()!!.toInt()

                        var encontradaE = false

                        for (e in entrada) {
                            if (idE == e[0]) {
                                println("Entrada:${e}")
                                encontradaE = true
                                break
                            }
                        }

                        if (encontradaE == false) {
                            println("No se encuentra registrada ninguna entrada con ese codigo")
                        }
                    }

                    4 -> {
                        println("3.Modificar algún plato del menú")
                        println("Ingrese el codigo de la entrada que desea modificar")
                        var idModificarE: Int = readLine()!!.toInt()

                        println("Codigo del la entrada:")
                        var codEntradaM: Int = readLine()!!.toInt()
                        println("Nombre del la entrada:")
                        var nombreEntradaM: String = readLine()!!.toString()
                        println("Descripción del plato:")
                        var descM: String = readLine()!!.toString()
                        println("Precio del plato:")
                        var precioEntradaM: Int = readLine()!!.toInt()

                        var nuevaEntrada = (mutableListOf(codEntradaM, nombreEntradaM, descM, precioEntradaM))

                        if (idModificarE >= 0) {
                            entrada[idModificarE] = nuevaEntrada.toMutableList()
                            println("Entrada modificada exitosamente")
                        } else {
                            println("No se encontró ninguna entrada con ese codigo para modificar")
                        }
                    }

                    5 -> {
                        println("4.Eliminar un plato del menú")
                        println("Ingrese la posición de la entrada que ya no hace parte del menú para eliminarla")
                        var idEliminarE: Int = readLine()!!.toInt()

                        if (idEliminarE >= 0) {
                            entrada.removeAt(idEliminarE)
                            println("Entrada eliminada exitosamente")
                        } else {
                            println("No se encontró ninguna entrada para eliminar")
                        }
                    }
                    else-> println("Ingreso una opción incorrecta")
                }
            }

            "2", "platos fuertes" -> {
                println(
                    "Quiere: \n1.Agregar platos fuertes al menú \n2.Visualizar los platos fuertes existentes en el menú" +
                            " \n3.Visualizar un plato fuerte especifico \n4.Modificar algún plato del menú \n5.Eliminar un plato del menú"
                )
                var accion: Int = readLine()!!.toInt()

                when (accion) {
                    1 -> {
                        println("1.Agregar platos fuertes al menú")
                        println("Codigo del plato fuerte:")
                        var codPF: Int = readLine()!!.toInt()
                        println("Nombre del plato fuerte:")
                        var nombrePF: String = readLine()!!.toString()
                        println("Descripción del plato:")
                        var descPF: String = readLine()!!.toString()
                        println("Precio del plato:")
                        var precioPF: Int = readLine()!!.toInt()
                        platoFuerte.add(mutableListOf(codPF, nombrePF, descPF, precioPF))
                    }

                    2 -> {
                        println("2.Visualizar los platos fuertes existentes en el menú")
                        for ((i, item) in platoFuerte.withIndex()) {
                            println(item)
                        }
                    }

                    3 -> {
                        println("Ingrese el codigo del plato fuerte que quiere visualizar")
                        var idPT: Int = readLine()!!.toInt()

                        var encontradaPT = false

                        for (pt in platoFuerte) {
                            if (idPT == pt[0]) {
                                println("Plato fuerte:${pt}")
                                encontradaPT = true
                                break
                            }
                        }

                        if (encontradaPT == false) {
                            println("No se encuentra registrado ningún plato fuerte con ese codigo")
                        }
                    }

                    4 -> {
                        println("3.Modificar algún plato del menú")
                        println("Ingrese el codigo del plato fuerte que desea modificar")
                        var idModificarPT: Int = readLine()!!.toInt()

                        println("Codigo del plato fuerte:")
                        var codPFM: Int = readLine()!!.toInt()
                        println("Nombre del plato fuerte:")
                        var nombrePFM: String = readLine()!!.toString()
                        println("Descripción del plato:")
                        var descPFM: String = readLine()!!.toString()
                        println("Precio del plato:")
                        var precioPFM: Int = readLine()!!.toInt()

                        var nuevoPF = (mutableListOf(codPFM, nombrePFM, descPFM, precioPFM))

                        if (idModificarPT >= 0) {
                            platoFuerte[idModificarPT] = nuevoPF.toMutableList()
                            println("Plato fuerte modificado exitosamente")
                        } else {
                            println("No se encontró ningún plato fuerte con ese codigo para modificar")
                        }
                    }

                    5 -> {
                        println("Ingrese la posición del plato fuerte que ya no hace parte del menú para eliminarlo")
                        var idEliminarPF: Int = readLine()!!.toInt()

                        if (idEliminarPF >= 0) {
                            platoFuerte.removeAt(idEliminarPF)
                            println("Plato fuerte eliminado exitosamente")
                        } else {
                            println("No se encontró ningún plato fuerte para eliminar")
                        }
                    }
                    else-> println("Ingreso una opción incorrecta")
                }
            }

            "3", "postres" -> {
                println(
                    "Quiere: \n1.Agregar postres al menú \n2.Visualizar los postres existentes en el menú" +
                            "\n3.Visualizar un postre especifico \n4.Modificar algún postre del menú \n5.Eliminar un postre del menú"
                )
                var accion: Int = readLine()!!.toInt()

                when (accion) {
                    1 -> {
                        println("1.Agregar postres al menú")
                        println("Codigo del postre:")
                        var codP: Int = readLine()!!.toInt()
                        println("Nombre del postre:")
                        var nombreP: String = readLine()!!.toString()
                        println("Descripción del postre:")
                        var descP: String = readLine()!!.toString()
                        println("Precio del postre:")
                        var precioP: Int = readLine()!!.toInt()
                        postre.add(mutableListOf(codP, nombreP, descP, precioP))
                    }

                    2 -> {
                        println("2.Visualizar los postres existentes en el menú")
                        for ((i, item) in postre.withIndex()) {
                            println(item)
                        }
                    }

                    3 -> {
                        println("Ingrese el codigo del postre que quiere visualizar")
                        var idPo: Int = readLine()!!.toInt()

                        var encontradaPo = false

                        for (p in postre) {
                            if (idPo == p[0]) {
                                println("Postre:${p}")
                                encontradaPo = true
                                break
                            }
                        }

                        if (encontradaPo == false) {
                            println("No se encuentra registrado ningún postre con ese codigo")
                        }


                    }

                    4 -> {
                        println("3.Modificar algún postre del menú")
                        println("Ingrese el codigo del postre que desea modificar")
                        var idModificarP: Int = readLine()!!.toInt()

                        println("Codigo del postre:")
                        var codPM: Int = readLine()!!.toInt()
                        println("Nombre del postre:")
                        var nombrePM: String = readLine()!!.toString()
                        println("Descripción del postre:")
                        var descPM: String = readLine()!!.toString()
                        println("Precio del postre:")
                        var precioPM: Int = readLine()!!.toInt()

                        var nuevoPostre = (mutableListOf(codPM, nombrePM, descPM, precioPM))

                        if (idModificarP >= 0) {
                            postre[idModificarP] = nuevoPostre.toMutableList()
                            println("Postre modificado exitosamente")
                        } else {
                            println("No se encontró ningún postre con ese codigo para modificar")
                        }
                    }

                    5 -> {
                        println("Ingrese la posición del postre que ya no hace parte del menú para eliminarlo")
                        var idEliminarP: Int = readLine()!!.toInt()

                        if (idEliminarP >= 0) {
                            postre.removeAt(idEliminarP)
                            println("Postre eliminado exitosamente")
                        } else {
                            println("No se encontró ningún postre para eliminar")
                        }
                    }
                    else-> println("Ingreso una opción incorrecta")
                }
            }

            "4", "bebidas" -> {
                println(
                    "Quiere: \n1.Agregar bebidas al menú \n2.Visualizar las bebidas existentes en el menú" +
                            " \n3.Visualizar una bebida especifica \n4.Modificar alguna bebida del menú \n5.Eliminar una bebida del menú"
                )
                var accion: Int = readLine()!!.toInt()

                when (accion) {
                    1 -> {
                        println("1.Agregar bebidas al menú")
                        println("Codigo de la bebida:")
                        var codBebida: Int = readLine()!!.toInt()
                        println("Nombre de la bebida:")
                        var nombreBebida: String = readLine()!!.toString()
                        println("Descripción de la bebida:")
                        var descBebida: String = readLine()!!.toString()
                        println("Precio de la bebida:")
                        var precioBebida: Int = readLine()!!.toInt()
                        bebida.add(mutableListOf(codBebida, nombreBebida, descBebida, precioBebida))
                    }

                    2 -> {
                        println("2.Visualizar las bebidas existentes en el menú")
                        for ((i, item) in bebida.withIndex()) {
                            println(item)
                        }
                    }

                    3 -> {
                        println("Ingrese el codigo de la bebida que quiere visualizar")
                        var idB: Int = readLine()!!.toInt()

                        var encontradaB = false

                        for (b in bebida) {
                            if (idB == b[0]) {
                                println("Bebida:${b}")
                                encontradaB = true
                                break
                            }
                        }

                        if (encontradaB == false) {
                            println("No se encuentra registrada ninguna bebida con ese codigo")
                        }

                    }

                    4 -> {
                        println("3.Modificar alguna bebida del menú")
                        println("Ingrese el codigo de la bebida que desea modificar")
                        var idModificarB: Int = readLine()!!.toInt()

                        println("Codigo de la bebida:")
                        var codBebidaM: Int = readLine()!!.toInt()
                        println("Nombre de la bebida:")
                        var nombreBebidaM: String = readLine()!!.toString()
                        println("Descripción de la bebida:")
                        var descBebidaM: String = readLine()!!.toString()
                        println("Precio de la bebida:")
                        var precioBebidaM: Int = readLine()!!.toInt()

                        var nuevaBebida =
                            (mutableListOf(codBebidaM, nombreBebidaM, descBebidaM, precioBebidaM))

                        if (idModificarB >= 0) {
                            bebida[idModificarB] = nuevaBebida.toMutableList()
                            println("Bebida modificada exitosamente")
                        } else {
                            println("No se encontró ninguna bebida con ese codigo para modificar")
                        }
                    }

                    5 -> {
                        println("Ingrese la posición de la bebida que ya no hace parte del menú para eliminarla")
                        var idEliminarB: Int = readLine()!!.toInt()

                        if (idEliminarB >= 0) {
                            bebida.removeAt(idEliminarB)
                            println("Bebida eliminada exitosamente")
                        } else {
                            println("No se encontró ninguna bebida para eliminar")
                        }
                    }
                    else-> println("Ingreso una opción incorrecta")
                }
            }
            else-> println("Ingreso una opción incorrecta")
        }
        println("Desea abrir otro menú")
        var resp:String= readLine()!!.toString().lowercase()
    }while (resp.equals("si"))
}