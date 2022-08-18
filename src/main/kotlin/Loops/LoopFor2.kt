fun main(){

    var contim = 0
    var contpar = 0

    for (i in 1..10){
        print("Digite o ${i}° numero : ")
        val num = readln().toInt()
        if (num%2 ==0 ){
            contpar++
        }else{
            contim++
        }
    }
    println("$contim numeros impares foram digitaos")
    println("$contpar numeros pares foram digitaos")

}