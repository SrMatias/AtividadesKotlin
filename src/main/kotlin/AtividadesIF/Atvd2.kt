fun main(){

    print("Digite um numero:")
    val num = readln().toInt()

    print("Digite um numero:")
    val num2 = readln().toInt()

    print("Digite um numero:")
    val num3 = readln().toInt()


if (num < num2 && num < num3 ){
   if (num2 < num3)
println("Os numeros digitados em ordem são:$num $num2 $num3 ")
else
    println("Os numeros digitados em ordem são:$num $num3 $num2 ")}

    if (num2 <num && num2 < num3){
        if (num < num3)
            print("Os numeros digitados em ordem são:$num2 $num $num3 ")
        else
           print( "Os numeros digitados em ordem são:$num2 $num3 $num ")}
    if (num3 < num && num3 < num2){
        if (num2 < num )
            print("Os numeros digitados em ordem são:$num3 $num2 $num ")
        else print("Os numeros digitados em ordem são:$num3 $num $num2 ")
    }





}