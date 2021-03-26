package list

interface LinkedListInterface<E> {

    //탐색
    fun search(target: E)

    //삽입
    fun insert(item: E)

    //삭제
    fun delete(node: Node<E>)

}