package list

fun main() {
    val list = List<Int>()
    list.add(0, 1)
    list.add(1, 3)
    list.add(2, 4)
    list.add(3, 2)

    println(list.toString())

    while (true) {
        println("---------------List 인터페이스 구현---------------")
        println("명령어를 입력하시오")
        println(
            "1: add  2: remove  3: set  4: get  5: contains  6: index of  7: size" +
                    " 8: clear 9: isEmpty 10: print  11: exit  "
        )
        println(">>>")

        val a = try {
            (readLine() ?: "").toInt()
        } catch (e: NumberFormatException) {
            println("숫자를 입력하시오")
        }

        when (a) {
            1 -> {
                println("추가 하고싶은 곳의 인덱스와 원소를 입력하세요")
                val idx = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("정수만 입력하세요")
                    continue
                }
                val value = try {
                    (readLine() ?: "").toInt()
                } catch (e: Exception) {
                    println("정수만 입력하세요")
                    continue
                }
                list.add(idx, value as Int)
                println(list.toString())
                println()
            }
            2 -> {
                println("제거하고 싶은 요소의 인덱스를 입력하세요")
                val idx = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("정수만 입력하세요")
                    continue
                }
                list.remove(idx)
                println("삭제되었습니다")
                println()
            }
            3 -> {
                println("넣고 싶은 위치와 요소를 입력하세요")
                val idx = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("정수만 입력하세요")
                    continue
                }
                val value = try {
                    (readLine() ?: "").toInt()
                } catch (e: Exception) {
                    println("정수만 입력하세요")
                    continue
                }
                if (!list.isEmpty()) {
                    try {
                        list.set(idx, value)
                        println("완료되었습니다")
                    } catch (e: ArrayIndexOutOfBoundsException) {
                        println("유효하지 않은 인덱스입니다")
                    }
                } else {
                    println("리스트가 비어있습니다")
                }
            }

            4 -> {
                println("인덱스를 입력하세요")
                val idx = try {
                    (readLine() ?: "").toInt()
                } catch (e: NumberFormatException) {
                    println("정수만 입력하세요")
                    continue
                }
                try {
                    println(list.get(idx))
                    println("완료되었습니다")
                } catch (e: Exception) {
                    println("리스트가 비어있습니다")
                }
            }
            5 -> {
                println("찾고싶은 요소를 입력하세요")
                val value = try {
                    (readLine() ?: "").toInt()
                } catch (e: Exception) {
                    println("정수만 입력하세요")
                    continue
                }
                if (list.contains(value)) {
                    println("리스트에 존재합니다")
                } else {
                    println("존재하지 않는 요소입니다")
                }
                println()

            }
            6 -> {
                println("찾고싶은 요소를 입력하세요")
                val value = try {
                    (readLine() ?: "").toInt()
                } catch (e: Exception) {
                    println("정수만 입력하세요")
                    continue
                }
                val result = list.indexOf(value)
                if (result >= 0) {
                    println("아이템이 " + result + "번째에 있습니다")
                } else if (result == -1) {
                    println("리스트에 존재하지 않습니다")
                }
                println()
            }
            7 -> {
                if (list.size() == 0) {
                    println("리스트가 비어있습니다")
                } else {
                    println("리스트 요소는 " + list.size() + "개 입니다")
                    println()
                }
            }
            8 -> {
                println("모든 요소가 삭제됩니다")
                list.clear()
                println()
            }
            9 -> {
                if (list.isEmpty()) println("리스트가 비어있습니다.")
                else println("리스트가 비어있지 않습니다")
                println()
            }
            10 -> {
                if (list.isEmpty()) {
                    println("리스트가 비었습니다")
                } else {
                    println(list.toString())
                }
                println()
            }
            11 -> return
        }

    }
}
