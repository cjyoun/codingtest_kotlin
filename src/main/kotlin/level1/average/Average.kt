package level1.average

import level1.changeletter.solution

//  행과 열의 크기가 같은 2개의 행렬 arr1과 arr2를 입력받아, 각 행렬의 같은 행, 같은 열의 값을 더하는 행렬 덧셈의 결과를 반환

fun main(){
    println("시작")
    val arr1value1:IntArray = intArrayOf(1,2,3,4)
    solution(arr1value1)
}

fun solution(arr: IntArray): Double {
    var answer = 0.0
    var sum:Double = 0.0
    var size = arr.size
    for(element in 0 until size ){
        sum += arr[element]
    }

    answer = sum / size

    println(answer)
    return answer
}
