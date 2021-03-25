package queue

class Queue<E> : QueueInterface<E> {
    private var queue: Array<E> = Array(10) { i -> Any() } as Array<E>
    private var rear = 0
    private var front = 0
    private var size = 0


    private fun resize(size: Int) {
        val newQueue: Array<E> = Array(size) { i -> Any() } as Array<E>
        var i = 1
        var j = front+1
        while (queue.size > i) {
            newQueue[i++] = queue[j++ % queue.size]
        }
        front = 0
        rear = queue.size-1
        queue = newQueue


    }

    override fun add(e: E): Boolean {
        if ((rear + 1) % queue.size == front) {
            resize(queue.size * 2)
        }
        rear = (rear+1)% queue.size
        queue[rear] = e
        size++
        return true
    }

    private fun isEmpty(): Boolean {
        return size==0
    }

    override fun remove(): E? {
        if (isEmpty()) {
            throw NoSuchElementException("queue is empty")
        } else {
            front = (front + 1) % queue.size
            val e = queue[front] as E
            size--

            if (size > 0 && size == queue.size / 4) {
                resize(queue.size / 2)
            }
            return e
        }
    }

    override fun peek(): E? {
        if (isEmpty()) {
            throw NoSuchElementException("queue is empty")
        } else {
            return queue[(front + 1) % queue.size] as E
        }
    }

    override fun toString(): String {
        var result = ""
        for (i in front+1 until rear+1) {
            result += (queue[i % queue.size].toString() + " ")
        }
        return result
    }


}