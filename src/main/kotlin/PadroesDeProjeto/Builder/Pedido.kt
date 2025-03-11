package PadroesDeProjeto.Builder

class Pedido private constructor(
    val id: String,
    val cliente: String,
    val total: Double,
    val endereco: String?,
    val cupomDesconto: String?,
    val observacao: String?
) {
    class Builder(private val id: String, private val cliente: String, private val total: Double) {
        private var endereco: String? = null
        private var cupomDesconto: String? = null
        private var observacao: String? = null

        fun endereco(endereco: String) = apply { this.endereco = endereco }
        fun cupomDesconto(cupom: String) = apply { this.cupomDesconto = cupom }
        fun observacao(obs: String) = apply { this.observacao = obs }

        fun build() = Pedido(id, cliente, total, endereco, cupomDesconto, observacao)
    }
}

