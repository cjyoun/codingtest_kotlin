package level1.patternnumber


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

// 또다른 답변 : LongArray를 선언할 때 크기과 값을 넣어주는 부분에서 값부분에 it을 사용하여 값을 넣어줌 (it은 인덱스 번호를 의미)
fun solution2(x: Int, n: Int): LongArray {
    val answer = LongArray(n) {
        (x.toLong() * (it + 1))
    }
    return answer
}