fun main(){

    // println()
    // readLine()
    // val
    // if else

    println("Qual é o seu primeiro nome?")

    val nome = readLine()

    if (nome.isNullOrBlank()){
        println("Olá VISITANTE, seja mundo bem vindo...")
    }else{
        println("Olá ${nome}, seja mundo bem vindo...")
    }

}

