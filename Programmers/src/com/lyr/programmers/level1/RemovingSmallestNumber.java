package com.lyr.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 2022년 2월 11일 (금요일)
 * 10. 제일 작은 수 제거하기
 */
public class RemovingSmallestNumber {
	public int[] solution(int[] arr) {
		System.out.println("시작 = "+Arrays.toString(arr));
		
		int[] answer = new int[arr.length-1];
		
		if(arr.length==1 && arr[0] == 10) {
			return answer = new int[] {-1};
		}
		
		//배열 -> List 
		//Arrays.asList() 사용하면 되지만 int형일 경우 불가능
		List<Integer> arrToList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//순서대로 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		//가장 작은 수 제거
		arrToList.remove(arrToList.indexOf(arr[0]));
		
		//List -> 배열
		//리스트.toArray(배열) 사용하면 되지만 int형일 경우 불가능
		answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
//		answer = arrToList.stream().mapToInt(i->i).toArray();
		
		System.out.println("종료 = "+Arrays.toString(answer));
		
		
        return answer;
    }
}

/*
Stream 
: 컬렉션, 배열 등에 대해 저장되어있는 요소들을 하나씩 참조하며 반복적인 처리를 가능케하는 기능
-> 불필요한 for문과 그안에서 이뤄지는 if문 등의 분기처리를 쓰지않고도 깔끔하고 직관적인 코드로 변형 가능

특징
1. 원본데이터를 읽기만 할 뿐 원본데이터 자체를 변경하지 않는다.
2. 한 번 사용하면 닫혀서 재사용이 불가능하기 때문에 필요하다면 정렬된 결과를 컬렉션이나 배열에 담아 반환
3. 작업을 내부 반복으로 처리하기 때문에 간결한 코드 가능

구조  = 데이어소스객체집합.Stream생성().중개연산().최종연산();
(중개연산은 Stream으로 전달받아 Stream으로 반환하므로 중개연산의 연속사용이 가능하다)

String[] array = {"abc", "bcd", "cde", "def"};
List<String> list = Arrays.asList(array) //배열을 List로 변형하고
					.stream() //1. Stram 생성
					.filter(e -> e.startsWith("e")) //2. 중개연산
					.collect(Collectors.toList()); //3. 최종 연산 : 중개 연산을 통해 가공된 stream을 모아준다.

*/

/*
Set과 List의 차이
List는 순서가 있는 Collection이기 때문에 데이터를 넣는 순서가 보장되며 따라서 index로 특정 아이템을 가져올 수 있음, 중복 허용
Set은 순서를 보장하지 않는 Collection이기 때문에 index로 특정 아이템을 가져올 수 없음, 중복을 허용하지 않음
-> contains의 속도가 Set이 빠르기 때문에 탐색이 잦다면 Set을 이용해야함
*/

/*
:: (이중콜론, 더블론론) 의 정식 명칭은 메소드 참조 표현식
-> 람다식에서 파라미터를 중복해서 쓰기 싫을때 사용
사용방법은 [인스턴스]::메소드명
	answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
*/
