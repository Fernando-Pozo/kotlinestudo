package PadroesDeProjeto.ChainOfResponsability

class SuporteGeral : SuporteBase() {
    override fun processarSolicitacao(tipo: String) {
        println("Suporte Geral: Resolvendo solicitação geral.")
    }
}