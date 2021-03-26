package set

class Set<E> : SetInterface<E> {
    var set: Array<E> = Array(10) { i -> Any() } as Array<E>

    private var top = -1

    // 중복 , 순서 없음
    override fun add(e: E): Boolean {
        if (set.contains(e)) {
            return false
        } else {
            if (top == set.size) {
                val newSet = Array(set.size * 2) { i -> Any() } as Array<E>
                set.copyInto(newSet)
                newSet[++top] = e
                set = newSet
            } else {
                set[++top] = e
            }
        }
        return true
    }

    override fun clear() {
        top = -1
    }

    override fun isEmpty(): Boolean {
        return top == -1
    }

    override fun remove(e: E): Boolean {
        if (set.contains(e)) {
            // TODO: 2021-03-26
            return true
        } else return false
    }

    override fun contains(e: E): Boolean {
       for(i in 0 ..set.size) {
           return set[i] == e
       }
        return false
    }

    override fun size(): Int {
        return top+1
    }

    override fun toString(): String {
        var result = ""
        for (i in 0..top) {
            result += (set[i].toString() + " ")
        }
        return result
    }

}