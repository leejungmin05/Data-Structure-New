package list

class Node<E> {
    val data: E
    var next: Node<E>

    constructor(newData: E, node: Node<E>) {
        data = newData
        next = node
    }

}