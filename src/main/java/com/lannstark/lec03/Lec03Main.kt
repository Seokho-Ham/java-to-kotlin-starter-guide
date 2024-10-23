import com.lannstark.lec03.Person

fun main() {

    val number1: Int? = 1

    //Error
    //val number2: Long = number1

    val number2: Long = number1?.toLong() ?: 0L


    val person = Person("Lannstark", 20)
    val comment = "이름: ${person.name}"

    val name = "Lannstark"
    val hello = "이름: $name"

    val str = "ABCDE"
    val a = str[1]


}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj
        println(person.age)
    }
}
