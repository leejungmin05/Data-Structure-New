package list

fun main() {
    val linkedList = LinkedList<Int>()

    while(true) {
        println("----------LinkedList 인터페이스 구현--------------")
        println("명령어를 입력하세요")
        println("1: search  2: insert   3: delete  4: print  5: exit \n>>>")

        val a = try {(readLine() ?: "").toInt()} catch (e : NumberFormatException) {println("숫자를 입력하세요")}

        when(a) {
            1->{
            }
            2->{
            }
            3->{
            }
            4-> {
                try {
                    println(linkedList.toString())
                } catch (e: NullPointerException) {
                    println("리스트가 비었습니다")
                    continue
                }
            }
            5-> return
        }
    }
}