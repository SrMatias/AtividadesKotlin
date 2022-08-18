import kotlin.math.pow

fun main(){
val pi =3.14
println("Digite o Diâmetro ")
       var diametro = readln().toDouble()
       var raio = diametro /2
       var area = pi * raio.pow(2)
       var perimetro = 2 * pi * raio
       println("Perimetro:$perimetro ")
    println("A area do circulo é de :$area")




   }
