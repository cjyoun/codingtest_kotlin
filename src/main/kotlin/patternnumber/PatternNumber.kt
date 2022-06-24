package patternnumber


fun main(){
    println("시작")
    println(solution(2,5).toString())
}

fun solution(x: Int, n: Int): LongArray {
    var answer = LongArray(n)
    var num: Long = x.toLong()
    for(i in answer.indices){
        println("num - $num")
        answer[i] = num
        num += x
    }


    return answer
}
