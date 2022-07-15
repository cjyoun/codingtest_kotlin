package level1.changeletter

// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수 완성

fun main(){
    println("시작")
    val phone_number:String = "01020202331"
    println(solution(phone_number))
}

fun solution(phone_number: String): String {
    var answer = ""

    val length = phone_number.length

    if (length<4) {
        return "4자리 이상의 번호를 적어주세요"
    }else if(length==4){
        answer = phone_number
    } else{
        val str = phone_number.substring(length-4)
        println(str)
        for(i in 0..length-5){
            answer += "*"
        }
        answer += str
    }

    return answer
}