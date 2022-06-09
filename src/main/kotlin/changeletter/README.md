# 문자열 변경 리턴
substring으로 뒤에서 4번째 글자까지 잘라서 변수에 저장한 후 나머지 글자만큼 *을 입력시킴

#
# 다른 해결법 
padStart 함수와 takeLast 함수 사용
PadStart : 첫번째 파라미터 길이만큼 두번째 파라미터 값을 넣기
takeLast : 글자의 맨 끝에서 파라미터만큼 전부터 substring
'''
return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
'''
