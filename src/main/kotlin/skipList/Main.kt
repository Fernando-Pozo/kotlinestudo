package skipList


fun main() {
    // Definindo um comparador para Inteiros
    val intComparator = Comparator<Int> { a, b -> a.compareTo(b) }

    // Criando a SkipList com o comparador para Inteiros
    val skipList = SkipList(intComparator)

    // Inserindo alguns valores na SkipList
    skipList.insert(10)
    skipList.insert(20)
    skipList.insert(30)
    skipList.insert(50)
    skipList.insert(40)

    // Verificando se um valor está na SkipList
    println("Contém 20? ${skipList.contains(20)}")  // Deve retornar true
    println("Contém 60? ${skipList.contains(60)}")  // Deve retornar false

    // Para observar a lista e os resultados
    println("Valores inseridos na lista:")
    for (i in 10..50 step 10) {
        println("Contém $i? ${skipList.contains(i)}")
    }
}
