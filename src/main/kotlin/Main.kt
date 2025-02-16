package org.example

import java.util.stream.Collectors


fun main() {
    exercicio12()
}


fun exercicio1() {
    //1️⃣ Exercício com List e map
    //Dada a lista de números, use map para criar uma nova lista onde cada número seja elevado ao quadrado.

    val numeros = listOf(1,2,3,4,5)
    val resultado = numeros.map { it * it }
    println(resultado)
}


fun exercicio2() {
    //2️⃣ Exercício com filter
    //Dada a lista de números, use filter para criar uma nova lista contendo apenas os números ímpares.

    val numeros = listOf(10, 15, 18, 21, 24)
    val resultado = numeros.filter { it % 2 != 0 }
    println(resultado)
}

fun exercicio3() {
    //3️⃣ Exercício com Sequence e map
    //Dada a lista de números, transforme ela em uma sequência (Sequence) e use map
    // para criar uma sequência onde cada número é multiplicado por 3.

    val numeros = listOf(2, 4, 6, 8, 10)
    val sequencia = numeros.asSequence()
    val resultado = sequencia.map { it * 3 }
    println(resultado.toList())

}


fun exercicio4() {
    //4️⃣ Exercício com Sequence, filter e map
    //Crie uma sequência de números de 1 a 100 e filtre todos os números
    // que são divisíveis por 5, depois multiplique esses números por 2.

    val numeros = generateSequence(1) { it + 1 }.take(100)
    val resultado = numeros.filter { it % 5 == 0 }.map { it * 2 }
    println(resultado.toList())
}


fun exercicio5() {
    //5️⃣ Exercício com flatMap e List
    //Dada a lista de listas de números, use flatMap para transformar em uma única lista e ordenar os números em ordem crescente.

    val listas = listOf(
        listOf(9, 3, 5),
        listOf(4, 1, 7),
        listOf(6, 8, 2)
    )

    val resultado = listas.flatMap { it }.sorted()
    println(resultado.toList())

}

fun exercicio6() {
    //6️⃣ Exercício com Stream (Java) e map
    //Use a API Stream do Java para pegar a lista de palavras abaixo, aplicar o map e transformar todas as palavras em maiúsculas.
    // (Dica: você pode usar stream() e collect() com Collectors.toList()).

    val palavras = listOf("kotlin", "java", "stream", "programação")
    val resultado = palavras.stream()
        .map { it.uppercase() }
        .collect(Collectors.toList())
    println(resultado)
}

fun exercicio7() {
    //7️⃣ Exercício com flatMap e Strings
    //Dada uma lista de frases, use flatMap para dividir todas as frases em palavras e depois filtrar aquelas que têm mais de 4 letras.

    val frases = listOf("Kotlin é incrível", "Java é muito bom", "Programação é divertida")
    val resultado = frases.flatMap { it.split(" ") }.filter { it.length > 4 }
    println(resultado)
}

fun exercicio8() {
    //8️⃣ Exercício com map, filter e List
    //Dada uma lista de números, use map para elevar cada número ao quadrado e depois use filter para pegar apenas os números que são maiores que 10.

    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = numeros.map { it * it }.filter { it > 10 }
    println(resultado)
}

fun exercicio9() {
    // 9️⃣ Exercício básico com distinct()
    //Objetivo: Dada uma lista de números, remova os números duplicados e mostre a lista com os números únicos.

    val numeros = listOf(1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9)
    val resultado = numeros.distinct()
    println(resultado)
}

data class Produto(val id: Int, val nome: String)
fun exercicio10() {
    //🔟Exercício com objetos e distinct()
    //Objetivo: Dada uma lista de objetos Produto, remova os produtos duplicados com base na comparação de todos os atributos (usando distinct()).

    val produtos = listOf(
        Produto(1, "Produto A"),
        Produto(2, "Produto B"),
        Produto(1, "Produto A"),
        Produto(3, "Produto C")
    )

    val unicos = produtos.distinct()
    println(unicos)
}

fun exercicio11() {
    //1️⃣1️⃣ Exercício com drop()
    //Objetivo: Dada uma lista de números, use drop() para remover os primeiros 4 elementos da lista e exiba os elementos restantes.
    val numeros = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    val resultado = numeros.drop(4)
    println(resultado)
}

data class Pessoa(val nome: String, val idade: Int)
fun exercicio12() {
    //1️⃣2️⃣ Exercício com sorted()
    //Objetivo: Dada uma lista de números e uma lista de objetos Pessoa, use sorted() para ordenar os elementos em ordem crescente.
    //
    //Ordenar uma lista de números em ordem crescente.
    //Ordenar uma lista de pessoas por nome em ordem alfabética.

    // Lista de números
    val numeros = listOf(35, 10, 50, 40, 25, 30)

    // Lista de pessoas
    val pessoas = listOf(
        Pessoa("Carlos", 30),
        Pessoa("Ana", 25),
        Pessoa("Beatriz", 20),
        Pessoa("Daniel", 35)
    )

    val resultadoNumerico = numeros.sorted()
    val resultadopessoas = pessoas.sortedBy { it.nome }

    println(resultadoNumerico)
    println(resultadopessoas)
}

