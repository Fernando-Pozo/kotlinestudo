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

    //*******************************
    // Exercicios de List
    //*******************************

    // 1️⃣ Crie uma lista com 5 nomes e imprima cada um deles.
    fun exercicio8() {
       var lista = listOf("brasil", "italia", "portugal", "espanha", "luxemburgo")
        for (i in lista){
            println(i)
        }
    }

    // 2️⃣ Crie uma lista mutável de três cores e adicione uma nova cor. Depois, remova a primeira cor da lista.
    fun exercicio9() {
        val lista = mutableListOf("preto", "branco", "verde")
        lista.add("azul")
        lista.removeFirst()
        lista.forEach{println(it)}
    }

    // 3️⃣ Verifique se um determinado número está presente em uma lista de números.
    fun exercicio10() {
        val numeros = listOf(1,2,2,2,3,3,4,4,5)
        val resultado = numeros.contains(5)
        println(resultado)
    }

    //*******************************
    // Exercicios de Conjuntos
    //*******************************

    //Crie uma função que receba uma lista de números inteiros e retorne um conjunto contendo apenas os valores únicos.
    fun exercicio11() {
        val lista = listOf(1, 2, 2, 3, 4, 4, 5)
        val resultado = lista.toSet()
        println(resultado)
    }

    //Crie uma função que receba dois conjuntos de números inteiros e retorne um novo conjunto contendo apenas os números que aparecem em ambos.
    fun exercicio12() {
        val conjuntoA = setOf(1, 2, 3, 4, 5)
        val conjuntoB = setOf(3, 4, 5, 6, 7)

        val intersecao = conjuntoA intersect conjuntoB

        println(intersecao)

    }

    //*******************************
    // Exercicios de Mapa
    //*******************************

    // Crie um mapa onde as chaves sejam os nomes dos alunos e os valores sejam listas de notas. Depois, calcule a média de cada aluno..

    fun exercicio13() {
        val alunos = mapOf(
            "Ana" to listOf(8.0, 7.5, 9.0),
            "Carlos" to listOf(6.5, 7.0, 5.5),
            "Bruna" to listOf(9.0, 8.5, 10.0),
            "Diego" to listOf(5.0, 6.0, 7.0)
        )

        for ((nome,notas) in alunos){
            val media = notas.average()
        println("$nome tem uma media $media")
        }
    }

}


