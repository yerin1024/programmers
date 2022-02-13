package com.lyr.programmers.level1;

/*
 * 2022년 2월 14일 (일요일)
 * 14. 이상한 문자 만들기
 */
public class StrangeString {
	public String solution(String s) {
		//각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
		//try hello world
		System.out.println(s);
		String answer = "";
		
		String[] arr = s.split(" ", -1); //-1을 안주면 공백공백공백 이렇게 세글자 들어올 경우 다 구분자로 사라짐-> 결과값이 달라짐 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			String[] tmpArr = arr[i].split("");
			String tmp = "";
			
			for(int j=0; j<tmpArr.length; j++) {
				if(j%2 == 0) { //짝수번째는 대문자
					tmpArr[j] = tmpArr[j].toUpperCase();
				}else { //홀수번째는 소문자
					tmpArr[j] = tmpArr[j].toLowerCase();
				}

				tmp += tmpArr[j];
			}
			System.out.println(tmp);
			answer += tmp;
			if(i != arr.length-1) {
				answer += " ";
			}
		}
		System.out.println(answer);
        return answer;
    }
}
//split() 메서드의 두번째 파라미터에 limit 값을 음수로(0보다 작은 정수) 주면 모든 구분값을 나눠서 배열로 반환한다.
// String str = t1
// str.split("1") -> [t]
// str.split("1", -1) -> [t], [공백]
