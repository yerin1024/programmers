package com.lyr.programmers.level1;

import java.util.Arrays;
/*
 * 2022년 2월 3일 (목요일)
 * 핸드폰 번호 가리기
 */
public class HidePhoneNumber {
	public String solution(String phone_number) {
		
		String[] arr = new String[phone_number.length()];
		
		for(int i=0; i<phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				arr[i] = "*";
			}else {
				arr[i] = Character.toString(phone_number.charAt(i)); 
				//문자열.charAt(i) : 문자열을 한글자씩 Character형으로 반환
				//Character.toString(character한글자) : character형 한글자를 String으로 바꿔줌
			}
		}
		
		String answer = String.join("", arr); //String.join(구분자, 배열) : 배열의 요소를 구분자와 함께 붙여줌
		System.out.println(answer);
		
        return answer;
    }
}
