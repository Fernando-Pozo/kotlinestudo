package PadroesDeProjeto.Strategy

import java.math.BigDecimal

class Compra(private val valor: BigDecimal) {
    fun compra(estrategiaPagamento: EstrategiaPagamento) {
        estrategiaPagamento.pagar(valor)
    }
}