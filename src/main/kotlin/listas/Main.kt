package org.example.listas

fun main() {
    val lista = ListaEncadeada<Int>()

    lista.adiciona(10)
    lista.adiciona(20)
    lista.adiciona(30)

    println(lista) // [10, 20, 30]

}
