package PadroesDeProjeto.ChainOfResponsability

abstract class SuporteBase : Suporte {
    private var proximoSuporte: Suporte? = null

    override fun setProximo(suporte: Suporte): Suporte {
        this.proximoSuporte = suporte
        return suporte
    }

    protected fun encaminharParaProximo(tipo: String) {
        proximoSuporte?.processarSolicitacao(tipo)
    }
}