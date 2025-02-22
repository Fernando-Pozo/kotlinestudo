package org.example

class estruturaDeDados {

    //*******************************
    // Exercicios de Array
    //*******************************

    // 1️⃣ Crie um array com os números de 1 a 5 e imprima cada elemento.
    fun exercicio1() {
        val numeros = arrayOf(1,2,3,4,5)
        for (i in numeros){
            println(i)
        }
    }

    // 2️⃣ Crie um array com os nomes de três frutas. Altere a segunda fruta e exiba o array atualizado.
    fun exercicio2() {
        val frutas = arrayOf("banana", "pera", "goiaba")
        frutas[1] = "melancia"
        for (i in frutas){
            println(i)
        }
    }

    // 3️⃣ Peça ao usuário para inserir números em um array e depois mostre quantos elementos ele tem.
    fun exercicio3() {
        val numeros = arrayOf(1,2,3,4,5)
        println(numeros.size)
    }

    // 4️⃣ Encontre o maior e o menor valor em um array.
    fun exercicio5() {
        val numeros = arrayOf(1,2,8,4,5)
        var maior = 0
        var menor = 0
        for (i in numeros){
            if (i > maior){
                maior = i
            }
            if (i < menor){
                menor = i
            }
        }
        println(maior)
        println(menor)
    }

    // 5️️⃣ Calcule a soma e a média dos elementos de um array.
    fun exercicio6() {
        val numeros = arrayOf(1,2,3,4,5)
        val soma = numeros.sum()
        val media = numeros.average()

        println(soma)
        println(media)
    }

    // 6️⃣ Remova valores duplicados de um array.
    fun exercicio7() {
        val numeros = arrayOf(1,2,2,2,3,3,4,4,5)
        val resultado = numeros.toSet()
        println(resultado)
    }

}


