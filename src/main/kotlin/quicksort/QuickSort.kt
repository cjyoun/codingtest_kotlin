// n의 각 자릿수를 작은것부터 큰 순으로 정렬한 새로운 정수를 리턴하기. 예: n이 118372면 112378 리턴.
// 퀵정렬을 이용해서 해결
fun main(){
    println("시작")
    val num: Int = 118375
    println(solution(num))
}

fun solution(n: Int): String {
    var answer:String = ""  // 정렬된 정수
    var num = n     // 받은 정수
    val numList = arrayListOf<Int>()    // 받은 정수를 배열에 나눠 넣기 위한 리스트

    // 정수를 10의 자리 마다 끊어서 넣기
    while(num > 0) {
        numList.add(num%10)
        num /= 10
    }

    // 퀵정렬 시작
    val answer2 = quickMerge(numList)
    // 정렬된 정수들을 하나의 글자로 만들기
    for(i in answer2.indices){
        answer += answer2[i].toString()
    }
    return answer
}


fun quickMerge(arr: ArrayList<Int>): ArrayList<Int>{
    // 정렬할 리스트가 1또는 0이면 그만하기
    if(arr.size <= 1){
        return arr
    }

    val pivot = arr[0]   // index의 처음 값을 pivot 설정 (비교대상 설정)
    arr.removeFirst()    // pivot값을 리스트에서 제거

    val left = arrayListOf<Int>()   // 왼쪽 리스트
    val right = arrayListOf<Int>()  // 오른쪽 리스트

    // pivot 값과 비교해서 작으면 왼쪽 크면 오른쪽 리스트로 이동  -> 이렇게하면 오름차순 반대로 하면 내림차순
    for(i in 0 until arr.size){
        if(arr[i] < pivot){
            left.add(arr[i])
        } else{
            right.add(arr[i])
        }

    }

    // 리턴해줄 리스트
    val mergeList = arrayListOf<Int>()

    // 재귀함수를 통해 정렬된 left + pivot + right 순으로 merge
    mergeList.addAll(quickMerge(left))
    mergeList.add(pivot)
    mergeList.addAll(quickMerge(right))

    return mergeList


}