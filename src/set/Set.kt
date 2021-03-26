package set

class Set<E> : SetInterface<E> {
    var set: Array<E> = Array(10) { i -> Any() } as Array<E>

    private var top = -1

    // 중복 , 순서 없음
    override fun add(e: E): Boolean {
        if (set.contains(e)) {
            return false
        } else {
            set[++top] = e
            return true
        }
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        return set.size == -1
    }

    override fun remove(e: E): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(e: E): Boolean {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        return set.size
    }








}