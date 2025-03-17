package PadroesDeProjeto.ChainOfResponsability

interface Suporte {
    fun setProximo(suporte: Suporte): Suporte
    fun processarSolicitacao(tipo: String)
}