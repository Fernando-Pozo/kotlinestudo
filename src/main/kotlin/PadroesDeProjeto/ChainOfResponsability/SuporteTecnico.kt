package PadroesDeProjeto.ChainOfResponsability

class SuporteTecnico : SuporteBase() {
    override fun processarSolicitacao(tipo: String) {
        if (tipo == "tecnico") {
            println("Suporte Técnico: Resolvendo solicitação técnica.")
        } else {
            encaminharParaProximo(tipo)
        }
    }
}