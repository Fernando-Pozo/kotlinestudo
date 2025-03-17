package PadroesDeProjeto.ChainOfResponsability

class SuporteFaturamento : SuporteBase() {
    override fun processarSolicitacao(tipo: String) {
        if (tipo == "faturamento") {
            println("Suporte de Faturamento: Resolvendo solicitação de faturamento.")
        } else {
            encaminharParaProximo(tipo)
        }
    }
}