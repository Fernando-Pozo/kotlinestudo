package trie

class Trie {
    private val root = TrieNode()

    // Inserção de palavra
    fun insert(word: String) {
        var node = root
        for (char in word) {
            node = node.children.getOrPut(char) { TrieNode() }
        }
        node.isEndOfWord = true
    }

    // Busca exata de palavra
    fun search(word: String): Boolean {
        var node = root
        for (char in word) {
            node = node.children[char] ?: return false
        }
        return node.isEndOfWord
    }

    // Busca por prefixo
    fun startsWith(prefix: String): Boolean {
        var node = root
        for (char in prefix) {
            node = node.children[char] ?: return false
        }
        return true
    }
}
