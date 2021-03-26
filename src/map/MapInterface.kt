package map


interface MapInterface<E> {

    // Map의 모든 객체 삭제
    fun clear()

    // 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인
    fun containsKey(key: E): Boolean

    // 지정된 key객체와 일치하는 Map의 value객체가 있는지 확인
    fun containsValue(value: E): Boolean

    // Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 set으로 반환
    fun entrySet(): Set<E>


    //지정한 key 객체에 대응하는 value 객체를 찾아서 반환
    fun get(key: E)

    // 해시코드 반환
    override fun hashCode(): Int

    // map이 비었는지 반환
    fun isEmpty(): Boolean

    // map에 저장된 모든 key 객체 반환
    fun keySet(): Set<E>

    // map에 value객체를 key객체에 연결하여 저장
    fun put(key: E, value: E)

    // 지정된 key객체와 일치하는 key-value 객체를 삭제
    fun remove(key: E)

    // key-value 쌍 객수 반환
    fun size(): Int



}