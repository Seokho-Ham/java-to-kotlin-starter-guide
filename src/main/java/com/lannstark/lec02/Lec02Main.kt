import com.lannstark.lec02.Person

fun main() {

    val str: String? = "ABC"
    println(str?.length)

    val str2: String? = null
    println(str2?.length)

    println(str2?.length ?: 0)

    val str1: String? = "ABC"
    str1!!.length

    val person = Person("공부하는 개발자")
    startWithA(person.name)

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startWithsA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWithsA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A") ?: false
}