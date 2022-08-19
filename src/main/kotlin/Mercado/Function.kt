fun  addmercadorias(produto:String){
    while (true)
        if (produto!= ""){
            estoque.add(produto)
            println("produto $produto adicionado com secesso!")
        }else{
            println("Produto invalido!")
        }
    }
fun removeMecadoria() {
    while (true) {
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

        println("Qual Produto sera atualizado? ")
        val produtoatt = readln()
        if (estoque.contains(produtoatt)){
            val posicao = estoque.indexOf(produtoatt)
            println("Qual o novo nome do produto? ")
            estoque[posicao] = readln()
            println("Produto $produtoatt atualizado com secesso!")

        }

        else {
            println("O produto $produtoatt não existe")

            }


        }

fun ver(){

    println()
    print(estoque)

}
fun menu(){

}

