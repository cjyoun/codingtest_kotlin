package pointingstar


fun main(){
    println("시작")
    val starSetting:String = "5 3"
    pointing(starSetting)
}

fun pointing(args:String): Unit {
    val (a, b) = args.split(' ').map(String::toInt)

    for(i in 0 until b){
        for(i in 0 until a){
            print("*")
        }
        println()
    }

}