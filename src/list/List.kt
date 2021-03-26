package list

import java.lang.Exception


class List<E> : ListInterface<E> {
    var list: Array<E> = Array(1) { i -> Any() } as Array<E>

    private var itemSize = 0 //항목수


    private fun isFull(): Boolean {
        return itemSize == list.size
    }

    override fun add(idx: Int, value: E) {
//        try{
//            if (isFull()) {
//                val newArr: Array<E> = Array(2 * list.size) { i -> Any() } as Array<E>
//                list.copyInto(newArr)
//                list = newArr
//            }
//            for (i in list.size-1 downTo idx + 1 ) {
//                list[i] = list[i - 1]
//            }
//            list[idx] = value
//            itemSize++
//            println("추가되었습니다")
//        }catch(e: ArrayIndexOutOfBoundsException ) {
//            println("유효하지 않은 인덱스입니다")
//        }

        // newArr의 size를 두배로 키웠을 때, null값이 값으로 출력되어버리는 문제..........

        try{
            if (isFull()) {
                val newArr: Array<E> = Array(1+ list.size) { i -> Any() } as Array<E>
                list.copyInto(newArr)
                list = newArr
            }
            for (i in list.size-1 downTo idx + 1 ) {
                list[i] = list[i - 1]
            }
            list[idx] = value
            itemSize++
            println("추가되었습니다") //listTest에서 구현하지 못한 점 ........유효하지않은데 자꾸 추가되엇다구하니까...
        }catch(e: ArrayIndexOutOfBoundsException ) {
            println("유효하지 않은 인덱스입니다")
        }

    }

    override fun remove(idx: Int): E {
//        if (isEmpty()) {
//            throw Exception("list is Empty")
//        } else {
        val element = list[idx] as E
        if (isFull()) {
            val newArr: Array<E> = Array(1+ list.size) { i -> Any() } as Array<E>
            list.copyInto(newArr)
            list = newArr
        }
            for (i in idx until itemSize - 1) {
                list[i] = list[i + 1]
            }
            itemSize--

        return element
    }

    override fun get(idx: Int): E {
    return list[idx]
    }

    override fun set(idx: Int, value: E): Boolean {
    list[idx] = value
    return true
    }

    override fun contains(value: E): Boolean {
    return indexOf(value) >= 0
    }

    override fun indexOf(value: E): Int {
        for (i in list.indices) {
            if (value == list[i]) {
                return i + 1
            }
        }
        return -1
    }


    override fun size(): Int {
    return itemSize
    }

    override fun isEmpty(): Boolean {
    return itemSize == 0
    }

    override fun clear() {
    itemSize = 0
    }

    override fun toString(): String {
    var result = ""
    for (i in 0 until itemSize) {
    result += (list[i].toString() + " ")
    }
    return result
    }

}