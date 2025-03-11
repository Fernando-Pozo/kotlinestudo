package PadroesDeProjeto.Builder

fun main() {
    val pedido = Pedido.Builder("126", "Carlos", 350.0)
        .endereco("Rua D, 999")
        .cupomDesconto("PROMO20")
        .observacao("Entrega rápida")
        .build()

    println("Pedido criado:")
    println("ID: ${pedido.id}")
    println("Cliente: ${pedido.cliente}")
    println("Total: ${pedido.total}")
    println("Endereço: ${pedido.endereco}")
    println("Cupom de Desconto: ${pedido.cupomDesconto}")
    println("Observação: ${pedido.observacao}")
}
