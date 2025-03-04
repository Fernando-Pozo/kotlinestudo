package PadroesDeProjeto.Strategy

import java.math.BigDecimal

fun main() {
    val valor = BigDecimal("10")
    val compra = Compra(valor)

    // compra.processarCompra(PagamentoCartaoCredito())
    compra.compra(PagamentoCartaoDebito())
}