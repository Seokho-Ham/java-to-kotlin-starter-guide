import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2000)
    val money2 = JavaMoney(1000)

    if(money1 > money2) {
        println("money1 is bigger")
    }

    val money3 = money1

    if (money1 === money3) {
        println("money1 and money3 are same")
    }

    if (money1 == money2) {
        println("money1 and money2 are same")
    }

    if (fun1() || fun2()) {
        println("true")
    }

    if (fun1() && fun2()) {
        println("true")
    }

}

fun fun1() : Boolean{
    println("fun1")
    return true
}

fun fun2() : Boolean{
    println("fun2")
    return false
}