package skipList
import kotlin.random.Random


class SkipList<T>(private val comparator: Comparator<T>) {
    private var curHeight: Int = 1
    private val head: Node<T> = Node(null, MAX_HEIGHT)
    private val rnd: Random = Random(System.currentTimeMillis())

    fun insert(value: T): Unit {
        // Array de nós prev de tipo Node<T>? porque pode ser nulo
        val prev: Array<Node<T>?> = Array(MAX_HEIGHT) { null }
        var x = findGreaterOrEqual(value, prev)

        assert(x == null || comparator.compare(x?.value, value) >= 0)

        val height = randomHeight()
        if (height > curHeight) {
            // Atualiza os nós prev com o head
            for (i in curHeight until height) {
                prev[i] = head
            }
            curHeight = height
        }

        x = Node(value, height)
        for (i in 0 until height) {
            // Garantir que prev[i] não seja nulo ao acessar next[i]
            x.next[i] = prev[i]?.next?.get(i)
            prev[i]?.next?.set(i, x)
        }
    }

    fun contains(value: T): Boolean {
        val x = findGreaterOrEqual(value, null)
        return x != null && x.value == value
    }

    private fun randomHeight(): Int {
        val branching = 4
        var level = 1
        while (level < MAX_HEIGHT && rnd.nextInt() % branching == 0) {
            level++
        }
        return level
    }

    private fun valueIsAfterNode(value: T, node: Node<T>?): Boolean {
        return node != null && comparator.compare(value, node.value) > 0
    }

    private fun findGreaterOrEqual(value: T, prev: Array<Node<T>?>?): Node<T>? {
        var x = head
        var level = curHeight - 1
        while (true) {
            val next = x.next[level]
            if (valueIsAfterNode(value, next)) {
                if (next != null) {
                    x = next
                }
            } else {
                if (prev != null) prev[level] = x
                if (level == 0) {
                    return next
                } else {
                    level--
                }
            }
        }
    }

    private fun findLessThan(value: T): Node<T> {
        var x = head
        var level = curHeight - 1
        while (true) {
            val next = x.next[level]
            if (valueIsAfterNode(value, next)) {
                if (next != null) {
                    x = next
                }
            } else {
                if (level == 0) {
                    return x
                } else {
                    level--
                }
            }
        }
    }

    private fun findLast(): Node<T> {
        var x = head
        var level = curHeight - 1
        while (true) {
            val next = x.next[level]
            if (next != null) {
                x = next
            } else {
                if (level == 0) {
                    return x
                } else {
                    level--
                }
            }
        }
    }

    class Node<T>(val value: T?, height: Int) {
        val next: Array<Node<T>?> = Array(height) { null }
    }

    companion object {
        const val MAX_HEIGHT = 12
    }
}