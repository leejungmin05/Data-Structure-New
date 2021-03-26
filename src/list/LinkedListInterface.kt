package list

interface LinkedListInterface<E> {

    //삽입
    fun insertFront(item: E)

    fun insertAfter(item: E, p: Node<E>)

    //삭제
    fun deleteFront()

    fun deleteAfter(node: Node<E>)

    //탐색
    fun search(target: E)

    //리스트 크기
    fun size(): Int

}