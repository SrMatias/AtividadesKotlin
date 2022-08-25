fun  addmercadorias(produto:String){
    while (true)
        if (produto!= ""){
            estoque.add(produto)
            println("produto $produto adicionado com secesso!")
            break
        }else{
            println("Produto invalido!")
        }
}
fun removeMecadoria() {
    while (true) {
        println("Qual desse Proutos deseja EXCLUIR? : $estoque")
        println("Qual Produto sera excluido? ")
        val produtoexc = readln()
        if (estoque.contains(produtoexc)) {
            estoque.remove(produtoexc)
            println("Produto $produtoexc excluido co secesso!")
            break
        } else {
            println("O produto $produtoexc não existe")
            println(estoque)

        }


    }
}

fun Atualizar(){

    println("Qual Produto sera RENOMEADO? :$estoque ")

    val produtoatt = readln()
    if (estoque.contains(produtoatt)){
        val posicao = estoque.indexOf(produtoatt)
        println("Qual o novo nome do produto? ")
        estoque[posicao] = readln()
        println("Produto $produtoatt foi Renomeado com secesso!")

    }

    else {
        println("O produto $produtoatt não existe")

    }


}

fun ver(){

    println()
    println(estoque,)

}
