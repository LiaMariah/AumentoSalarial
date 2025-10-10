//LIA MARIAH COUTO OLIVO
fun main() {
    print("Digite o nome do funcionário: ")
    val nome = readLine()!!

    print("Digite o salário atual: R$ ")
    val salario_atual = readLine()!!.replace(",", ".").toDouble()

    val aumento = salario_atual * 0.25
    val novo_salario = salario_atual + aumento

    println("\nResultado:")
    println("Funcionário: $nome")
    println("Novo salário com 25% de aumento: R$ ${"%.2f".format(novo_salario)}")
}