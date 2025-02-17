package org.example

import java.util.stream.Collectors


fun main() {
    exercicio29()
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

fun exercicio13() {
    //Exercício 1: Imprimir Elementos de uma Lista
    //Crie uma lista de strings com os nomes de frutas (por exemplo, "Maçã", "Banana", "Laranja") e use o forEach para imprimir cada fruta.

    val frutas = listOf("Maça", "Banana", "Laranja")
    frutas.forEach{println(it)}
}

fun exercicio14(){
    //Exercício 2: Somar Números de uma Lista
    //Crie uma lista de números inteiros e use o forEach para calcular a soma de todos os números. Imprima o resultado.
    //
    //Dica: Use uma variável acumuladora (var soma = 0) para armazenar a soma durante a iteração.

    val numeros = listOf(1, 2, 3, 4, 5)
    var soma = 0
    numeros.forEach { num ->
        soma += num
    }
    println(soma)
}

fun exercicio15(){
    //Exercício 3: Filtrar Números Pares
    //Crie uma lista de números inteiros e use o forEach para imprimir apenas os números pares.

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }
    pares.forEach { println(it) }
}

fun exercicio16(){
    //Exercício 4: Transformar Elementos de uma Lista
    //Crie uma lista de strings com palavras em minúsculas e use o forEach para imprimir cada palavra em maiúsculas.

    val palavras = listOf("kotlin", "java", "programação", "android")
    val palavrasM = palavras.map { it.uppercase() }
    palavrasM.forEach { println(it) }
}

fun exercicio17() {
    // Exercício 1: Soma dos Números
    // Crie uma lista de números inteiros e use o reduce para calcular a soma de todos os números. Imprima o resultado.
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultados = numeros.reduce { acumulador, num ->
        acumulador + num
    }
    println(resultados)
}

fun exercicio18() {
    // Exercício 2: Produto dos Números
    // Crie uma lista de números inteiros e use o reduce para calcular o produto de todos os números. Imprima o resultado.
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = numeros.reduce{acumulador, num ->
        acumulador * num
    }
    println(resultado)
}

fun exercicio19() {
    // Exercício 3: Maior Número
    // Use o reduce para encontrar o maior número em uma lista de inteiros. Imprima o resultado.
    val numeros = listOf(10, 25, 8, 99, 32)
    val resultado = numeros.reduce{acumulador, num ->
        if (num > acumulador) num else acumulador
    }
    println(resultado)
}

fun exercicio20() {
    // Exercício 4: Concatenação de Strings
    // Crie uma lista de palavras e use o reduce para concatená-las em uma única string separada por espaços.
    val palavras = listOf("Kotlin", "é", "uma", "linguagem", "fantástica")
    val resultado = palavras.reduce{frase, palavra ->
        frase + " " + palavra
    }
    println(resultado)
}

fun exercicio21() {
    // Exercício 5: Soma dos Quadrados
    // Use o fold para calcular a soma dos quadrados dos números em uma lista de inteiros. Imprima o resultado.
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = numeros.fold(0){acumulador, num ->
        acumulador + (num * num)
    }
    println(resultado)
}

fun exercicio22() {
    // Exercício 6: Contagem de Caracteres
    // Use o fold para contar o total de caracteres em uma lista de palavras. Imprima o resultado.
    val palavras = listOf("Kotlin", "é", "top")
    val resultado = palavras.fold(0){contador, i ->
        contador + i.length
    }
    println(resultado)
}

fun exercicio23() {
    // Exercício 1: Contar números maiores que 10
    // Dada uma lista de números inteiros, use count() para contar quantos são maiores que 10.
    val numeros = listOf(5, 12, 8, 20, 15, 3)
    val resultado = numeros.count{it > 10}
    println(resultado)
}

fun exercicio24() {
    // Exercício 2: Contar palavras com mais de 5 letras
    // Dada uma lista de palavras, use count() para contar quantas possuem mais de 5 letras.
    val palavras = listOf("Kotlin", "Java", "Python", "Go", "JavaScript")
    val resultado = palavras.count{it.length > 5}
    println(resultado)
}

fun exercicio25() {
    // Exercício 3: Contar ocorrências de um número específico
    // Dada uma lista de números, use count() para contar quantas vezes o número 3 aparece.
    val numeros = listOf(3, 7, 3, 9, 3, 5, 3)
    val resultado = numeros.count{it == 3}
    println(resultado)
}

fun exercicio26() {
    // Exercício 4: Contar elementos únicos
    // Use count() junto com distinct() para contar quantos números distintos existem na lista.
    val numeros = listOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    val resultado = numeros.distinct().count()
    println(resultado)
}

fun exercicio27() {
    // Exercício 1: Soma de números inteiros
    // Dada uma lista de inteiros, use sum() para calcular a soma total.
    val numeros = listOf(10, 20, 30, 40, 50)
    val resultado = numeros.sum()
    println(resultado)
}

fun exercicio28() {
    // Exercício 2: Soma de números pares
    // Use sumOf() para somar apenas os números pares de uma lista.
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val resultado = numeros.sumOf { if (it % 2 == 0) it else  0}
    println(resultado)
}

fun exercicio29() {
    // Exercício 4: Soma dos quadrados dos números
    // Use sumOf() para calcular a soma dos quadrados de uma lista de números.
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = numeros.sumOf { (it * it) }
    println(resultado)

}

