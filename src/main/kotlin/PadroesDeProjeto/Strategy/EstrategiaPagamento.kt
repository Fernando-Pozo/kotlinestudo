package PadroesDeProjeto.Strategy

import java.math.BigDecimal

interface EstrategiaPagamento {
    fun pagar(valor: BigDecimal)
}