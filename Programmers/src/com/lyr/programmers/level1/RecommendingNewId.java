package com.lyr.programmers.level1;


/*
 * 2022년 2월 15일 (화요일)
 * 42. 신규 아이디 추천
 */
public class RecommendingNewId {
	public String solution(String newId) {
		String answer = "";

		/*
		 * 3글자 이상 15자 이하 소문자, 숫자, -, _, . 만 사용 가능 .는 처음과 끝에는 사용할 수 없고 연속불가능
		 */

//		String pattern = "^([a-z]|[0-9]|[-_])([a-z]|[0-9]|[-_.]){1,13}([a-z]|[0-9]|[-_])$";
		System.out.println("시작 = " + newId);

		System.out.println("=================================");
		// 1. 대문자->소문자
		System.out.println("1단계 before = " + newId);
		newId = newId.toLowerCase();
		System.out.println("1단계 after = " + newId);

		// 2. !, @, #, * ->제거
		System.out.println("2단계 before = " + newId);
		newId = newId.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2단계 after = " + newId);

		// 3. ..., .. ->.
		System.out.println("3단계 before = " + newId);
		newId = newId.replaceAll("[.]{2,}", ".");
		System.out.println("3단계 after = " + newId);

		// 4. 첫번째, 마지막 마침표 제거
		System.out.println("4단계 before = " + newId);

		while (newId.length() > 0) { //이거 안해줘서 이거 아래줄 newId.length()-1때문에 2, 22, 23에서 런타임 에러 났었음
			if (newId.charAt(0) == '.' || newId.charAt(newId.length() - 1) == '.') {
				newId = newId.replaceAll("^[.]|[.]$", "");
				System.out.println("4단계 after = " + newId);
			}
		}

		// 5. 빈문자열 이면 a
		System.out.println("5단계 before = " + newId);
		if (newId.isEmpty()) {
			newId = "a";
		}
		System.out.println("5단계 after = " + newId);

		// 6. 16자 이상일 경우 15자 제외한 나머지 문자 제거
		System.out.println("6단계 before = " + newId);
		if (newId.length() > 15) {
			newId = newId.substring(0, 15);
			newId = newId.replaceAll("[.]$", "");
		}
		System.out.println("6단계 after = " + newId);

		// 7. 길이가 2자 이하이면 마지막 문자를 3글자될때까지 추가
		System.out.println("7단계 before = " + newId);
		while (newId.length() < 3) {
			newId += newId.charAt(newId.length() - 1);
		}
		System.out.println("7단계 after = " + newId);
		System.out.println();

		System.out.println("결과 = " + newId);
		answer = newId;
		return answer;
	}
}
