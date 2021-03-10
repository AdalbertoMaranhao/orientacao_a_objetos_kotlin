class Pessoa {
    var nome: String = "João"
    var cpf: String = "123.456.789-10"
}

fun main() {
    val joao = Pessoa()
    println(joao.nome)
    println(joao.cpf)
}