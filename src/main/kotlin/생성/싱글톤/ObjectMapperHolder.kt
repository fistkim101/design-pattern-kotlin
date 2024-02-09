package 생성.싱글톤

object ObjectMapperHolder {

    val instance = ObjectMapper()

}

class ObjectMapper {
    fun doSomething() {
        println("objectMapper do something ...")
    }
}