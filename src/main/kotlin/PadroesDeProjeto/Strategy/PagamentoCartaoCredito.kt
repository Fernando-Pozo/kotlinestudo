package PadroesDeProjeto.Strategy

import java.math.BigDecimal

class PagamentoCartaoCredito : EstrategiaPagamento {
    override fun pagar(valor: BigDecimal) {
        println("Pagou no crédito $valor")
    }
}