package org.example.listas

data class No<T>(
    var elemento: T,
    var proximo: No<T>? = null
)