package org.example

//***************************
// Fila
//***************************
// Para testar a fila
/*
    val fila = Fila<Int>(3) // Criando uma fila com capacidade para 3 elementos

    fila.inserir(10)
    fila.inserir(20)
    fila.inserir(30)

    fila.mostrarfila() // Exibe: [10, 20, 30]

    println("A fila está cheia? ${fila.isFull()}") // true

    fila.inserir(40) // Exibe: "Fila esta cheia!" (pois a capacidade é 3)

    println("Removendo: ${fila.retirar()}") // Remove e exibe 10
    println("Removendo: ${fila.retirar()}") // Remove e exibe 20

    println("A fila está vazia? ${fila.isEmpty()}") // false

    fila.mostrarfila() // Exibe: [30]
*/


class Fila<T>(private val capacidade: Int) {
   private val elementos = mutableListOf<T>()

   fun inserir(item: T) {
       if(isFull()){
           println("Fila esta cheia!")
       }else {
           elementos.add(item)
       }
   }

   fun retirar(): T? {
       return if (elementos.isNotEmpty()) elementos.removeAt(0) else null
   }

   fun isEmpty(): Boolean {
       return elementos.isEmpty()
   }

   fun isFull(): Boolean{
       return elementos.size >= capacidade
   }

   fun mostrarfila() {
       println(elementos)
   }
}


