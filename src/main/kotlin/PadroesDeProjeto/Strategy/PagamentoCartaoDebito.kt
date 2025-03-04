package PadroesDeProjeto.Strategy

import java.math.BigDecimal

class PagamentoCartaoDebito : EstrategiaPagamento {
    override fun pagar(valor: BigDecimal) {
        println("Pagou no débito $valor")
    }
}