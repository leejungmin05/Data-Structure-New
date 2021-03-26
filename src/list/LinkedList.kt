package list

class LinkedList<E>: LinkedListInterface<E> {
    private var head: Node<E>? = null
    private val size = 0

   inner class Node<E> (
       val item: E,
       var next: Node<E>
       )


    override fun insertFront(item: E) {
        TODO("Not yet implemented")
    }

    override fun insertAfter(item: E, p: list.Node<E>) {
        TODO("Not yet implemented")
    }

    override fun deleteFront() {
        TODO("Not yet implemented")
    }

    override fun deleteAfter(node: list.Node<E>) {
        TODO("Not yet implemented")
    }

    override fun search(target: E) {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        TODO("Not yet implemented")
    }
}


