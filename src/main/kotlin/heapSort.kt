fun heapSort(arr: IntArray) {
    val n = arr.size

    // Construir Max-Heap (reorganizar o array)
    for (i in n / 2 - 1 downTo 0) {
        heapify(arr, n, i)
    }

    // Extrair elementos um por um da heap
    for (i in n - 1 downTo 1) {
        // Trocar a raiz (maior elemento) com o último elemento
        arr[0] = arr[i].also { arr[i] = arr[0] }
        // Chamar heapify na heap reduzida
        heapify(arr, i, 0)
    }
}

fun heapify(arr: IntArray, n: Int, i: Int) {
    var maior = i
    val esq = 2 * i + 1
    val dir = 2 * i + 2

    // Se o filho esquerdo for maior que a raiz
    if (esq < n && arr[esq] > arr[maior]) {
        maior = esq
    }

    // Se o filho direito for maior que o maior até agora
    if (dir < n && arr[dir] > arr[maior]) {
        maior = dir
    }

    // Se o maior não for a raiz
    if (maior != i) {
        arr[i] = arr[maior].also { arr[maior] = arr[i] }
        // Recursivamente aplicar heapify na subárvore afetada
        heapify(arr, n, maior)
    }
}

fun main() {
    val arr = intArrayOf(4, 10, 3, 5, 1, 50)
    println("Array original: ${arr.joinToString(", ")}")

    heapSort(arr)

    println("Array ordenado com Heap Sort: ${arr.joinToString(", ")}")
}
