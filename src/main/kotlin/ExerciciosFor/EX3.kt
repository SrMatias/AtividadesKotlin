fun main(){

    var soma: Int = 0
    for(i in 3..500 step 3){
        if(i%2==1){

            soma =+ i
        }
    }
    print(soma)

}