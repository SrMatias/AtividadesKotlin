fun main() {

    var menor = 0
    var maior = 0
    var idade = 0

    while (idade != -99) {
        print("Digite sua idade: ")
        idade = readln().toInt()
        if (idade <= 21) {
            menor++
        } else if (idade >= 50) {
            maior++
        }
    }

    println("Total de pessoas com menos de 21 anos: $menor")
    println("Total de pessoas com mais de 50 anos: $maior")

}
