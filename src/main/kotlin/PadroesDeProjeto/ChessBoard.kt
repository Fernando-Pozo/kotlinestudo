package PadroesDeProjeto

/*Singleton*/
class ChessBoard private constructor() {
    companion object {
        @Volatile
        private var instance: ChessBoard? = null

        fun getInstance(): ChessBoard {
            return instance ?: synchronized(this) {
                instance ?: ChessBoard().also { instance = it }
            }
        }
    }
}

fun main() {
    val tabuleiro1 = ChessBoard.getInstance()
    val tabuleiro2 = ChessBoard.getInstance()

    println(tabuleiro1)
    println(tabuleiro2)
}
