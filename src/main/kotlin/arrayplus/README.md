# 배열의 합 구하기 
행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과 구하기



# 배열의 정리
1. 배열(Array) 선언
######
Array 객체를 생성함. size가 0이면 추가를 할 수 없음

```kotlin
var array1 = emptyArray<Int>()  // 빈 배열 객체 생성 (size가 0)
var array2 = Array<Int>(1){0}    // 배열 객체 생성 (size 가 1이고 모든 값을 0으로 초기화)
var array3 = arrayOfNulls<Int>(1) // 배열 객체 생성 (Size 가 1이고 모든 값을 null로 초기화)
var array4 = arrayOf(1,2,3) // 값을 넣은 배열 객체 생성
```
자료형을 먼저 써줌으로 = 뒤에 자료형 생략가능
```kotlin
var array1_1:Array<Int> = emptyArray()  
var array2_1:Array<Int>  = Array(1){0}
var array3_1:Array<Int?>  = arrayOfNulls(1) // 모든 값을 null로 세팅하기 때문에 ? 붙여줘야 함 
var array4_1:Array<Int>  = arrayOf(1,2,3)
```

### -> 배열 객체를 생성할 때는 size가 정해져있어야 하며 그안에 값이 있어야 함.
#

2. ArrayList 선언
####
size 및 값을 선언해 줄 필요가 없고 ArrayList안에 어떤 자료형이 올지만 선언.
```kotlin
var arrayList1 = ArrayList<Int>()
// or
var arrayList1_1:ArrayList<Int> = ArrayList()
```
add 로 List에 추가
```kotlin
arrayList1.add(1)
```