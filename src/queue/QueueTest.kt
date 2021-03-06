package queue

fun main() {
    val queue = Queue<Int>()

    queue.add(7)
    queue.add(5)
    queue.add(4)
    queue.add(1)
    queue.add(1)
    queue.add(1)
    queue.add(1)
    queue.add(1)
    queue.add(8)



    println(queue.toString())

    while (true) {
        println("----------------Queue 인터페이스 구현------------")
        println("명령어를 입력하세요")
        println("1 : add  2 : remove  3 : peek  4: print  5 : exit \n>>>")
        val a = try {
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) {
            println("숫자를 입력하세요")
        }

        when (a) {
            1 -> {
                print("queue에 추가 할 숫자 입력하세요 : ")
                val e = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                queue.add(e)
                println(queue.toString())

            }
            2 -> {
                try {
                    println("가장 첫 번째 요소가 삭제됩니다.")
                    queue.remove()
                    println(queue.toString())
                } catch (e: Exception) {
                    println("queue가 비어있습니다")
                }

            }
            3 -> {
                try {
                    print("가장 첫번째 요소 입니다. ")
                    println(": " + queue.peek())
                } catch (e: Exception) {
                    println("queue가 비어있습니다")
                }
            }
            4 -> {
                try {
                    println(queue.toString())
                } catch (e: Exception) {
                    println("queue가 비어있습니다")
                }
            }
            5 -> return
        }
    }


}