package org.example

//***************************
// Pilha
//***************************
// Para testar a pilha
/*
val pilha = Pilha<Int>()

pilha.push(10)
pilha.push(20)
pilha.push(30)

println("Topo da pilha: ${pilha.peek()}") // Deve mostrar 30

println("Removendo: ${pilha.pop()}") // Remove 30
println("Removendo: ${pilha.pop()}") // Remove 20

println("A pilha está vazia? ${pilha.isEmpty()}") // false
*/


class Pilha<T> {
    private val elementos = mutableListOf<T>()

    fun push(item:T){
        elementos.add(item)
    }

    fun pop():T?{
        return if (elementos.isNotEmpty()) elementos.removeAt(elementos.size - 1) else null
    }

    fun peek():T?{
        return elementos.lastOrNull()
    }

    fun isEmpty(): Boolean{
        return elementos.isEmpty()
    }
}


