package level1.harshadnumber

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수 이다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수를 완성하시오.

fun main(){
    println("시작")
    val phone_number:Int = 1234
    println(solution(phone_number).toString())
}

fun solution(harshadNum: Int): Boolean {
    var answer = true

    var num = harshadNum     // 받은 정수
    var sum = 0;
    // 정수를 10의 자리 마다 끊어서 넣기
    while(num > 0) {
        sum += num % 10
        num /= 10
    }

    answer = (harshadNum%sum == 0)

    return answer
}



//class Solution {
//    fun solution(x: Int): Boolean {
//        return x % x.toString().fold(0) {acc, c ->
//            acc + c.toInt() - 48
//        } == 0
//    }
//}