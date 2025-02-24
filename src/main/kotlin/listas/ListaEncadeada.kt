package org.example.listas

class ListaEncadeada<T> {

    private var inicio: No<T>? = null
    private var ultimo: No<T>? = null
    private var tamanho = 0

    fun adiciona(elemento: T) {
        val novoNo = No(elemento)
        if (inicio == null) {
            inicio = novoNo
        } else {
            ultimo?.proximo = novoNo
        }
        ultimo = novoNo
        tamanho++
    }

    override fun toString(): String {
        val elementos = mutableListOf<T>()
        var atual = inicio
        while (atual != null) {
            elementos.add(atual.elemento)
            atual = atual.proximo
        }
        return elementos.toString()
    }
}