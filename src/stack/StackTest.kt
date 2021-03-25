package stack

import java.lang.Exception

fun main() {
    val stack = Stack<Int>()
    stack.push(3)
    stack.push(5)
    stack.push(7)
    stack.push(8)
    stack.push(4)
    stack.push(8)
    stack.push(1)
    stack.push(6)
    stack.push(7)


//    println(stack.pop())
//    println(stack.pop())


    println(stack.toString())


    while(true){
        print(
            "\n명령어를 입력해주세요\n"+
                    "1 : push 2: pop 3: peek 4: clear 5:search 6: size 7: empty 8: print 9: exit \n >>>"
        )
        val a = try {(readLine() ?: "").toInt()} catch (e : Exception) {println("숫자만 입력하세요")}

        when(a) {
            1 -> {
                print("push 할 아이템을 입력하세요 : ")
                val item = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                stack.push(item)
                println(stack.toString())
            }
            2 -> {
                try {
                    stack.pop()
                    println("가장 위의 아이템을 반환한 뒤 삭제합니다")
                } catch (e: Exception) {
                    println("스택이 비어있습니다.")
                }
            }
            3 -> {
                try {
                    println(stack.peek())
                    println("stack 가장 위의 아이템입니다")
                } catch (e: Exception) {
                    println("스택이 비어있습니다.")
                }
            }
            4 -> {
                try {
                    stack.clear()
                    println("스택의 모든 아이템을 삭제합니다")
                } catch (e: Exception) {
                    println("스택이 비어있습니다.")
                }

            }
            5 -> {
                println("찾고싶은 아이템을 입력하세요")
                val item = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("숫자를 입력하세요")
                }
                try {
                    if (stack.search(item) == -1) {
                        println("입력하신 아이템이 없습니다")
                    } else
                        println("아이템은 top으로부터 "+stack.search(item) + "번째에 있습니다")
                } catch (e: Exception) {
                    println("스택이 비어있습니다.")
                }
            }
            6-> println("stack의 사이즈는 " + stack.size() + "입니다")
            7-> if(stack.isEmpty()) {
                println("stack이 비어있습니다")
            }else {
                println("stack이 비어있지 않습니다.")
            }
            8-> if(stack.isEmpty()) println("stack이 비어있습니다")
            else println(stack.toString())

            9-> return

        }
    }
}

