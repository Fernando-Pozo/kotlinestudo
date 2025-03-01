package trie

fun main() {
 /*
       (root)
       /    \
      c      d
     / \      \
    a   a      o
   /     \      \
  t       r      g
  *       *      *

*/


    val trie = Trie()
    trie.insert("car")
    trie.insert("cat")
    trie.insert("dog")

    println(trie.search("cat"))
    println(trie.search("can"))
    println(trie.startsWith("ca"))
    println(trie.startsWith("do"))
    println(trie.startsWith("da"))
}