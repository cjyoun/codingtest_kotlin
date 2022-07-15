package level1.arrayplus

//  행과 열의 크기가 같은 2개의 행렬 arr1과 arr2를 입력받아, 각 행렬의 같은 행, 같은 열의 값을 더하는 행렬 덧셈의 결과를 반환

fun main(){
    println("시작")
    val arr1value1:IntArray = intArrayOf(1,2)
    val arr1value2:IntArray = intArrayOf(2,3)
    val arr1:Array<IntArray> = arrayOf(arr1value1, arr1value2)
    val arr2value1:IntArray = intArrayOf(3,4)
    val arr2value2:IntArray = intArrayOf(5,6)
    val arr2:Array<IntArray> = arrayOf(arr2value1, arr2value2)
    println(solution(arr1,arr2).toString())
}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer:Array<IntArray> = Array(arr1.size){IntArray(arr1[0].size)}

    println(arr1[0].size)

    for(i in arr1.indices){
        var answerValue = IntArray(arr1[i].size) { 0 }
        var num = 0
        for(j in 0 until arr1[i].size){
            num = arr1[i][j] + arr2[i][j]
            answerValue[j] = num
        }
        answer[i] = answerValue
    }

    return answer
}




// arrayList 사용
//fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): ArrayList<IntArray> {
//    var answer:ArrayList<IntArray> = arrayListOf()
//
//    println(arr1[0].size)
//
//    for(i in arr1.indices){
//        var answerValue = IntArray(arr1[i].size) { 0 }
//        var num = 0
//        for(j in 0 until arr1[i].size){
//            num = arr1[i][j] + arr2[i][j]
//            answerValue[j] = num
//        }
//        answer.add(answerValue)
//    }
//
//    return answer
//}