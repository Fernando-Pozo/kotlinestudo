package PadroesDeProjeto.ChainOfResponsability

fun main() {
    val suporteTecnico = SuporteTecnico()
    val suporteFaturamento = SuporteFaturamento()
    val suporteGeral = SuporteGeral()

    suporteTecnico.setProximo(suporteFaturamento).setProximo(suporteGeral)

    val tiposDeSolicitacao = listOf("tecnico", "faturamento", "outro")

    for (tipo in tiposDeSolicitacao) {
        println("\nProcessando solicitação do tipo: $tipo")
        suporteTecnico.processarSolicitacao(tipo)
    }
}