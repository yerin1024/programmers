package com.lyr.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * 2022년 2월 14일 (월요일)
 * 28. 같은 숫자는 싫어
 */
public class RemovingDuplication {
	public int[] solution(int []arr) {
        int[] answer = {};
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        List<Integer> arrToList = new ArrayList<>();
        arrToList.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(arrToList.get(arrToList.size()-1) != arr[i]) {
        		arrToList.add(arr[i]);
        	}
        }
        
        for(int j=0; j<arrToList.size(); j++) {
        	System.out.println(arrToList.get(j));
        }
        answer = arrToList.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.println(answer[0]);
        return answer;
    }
}

/*
Integer[] integerArr = set.toArray(new Integer[0]);
Set 객체의 toArray() 메소드를 이용하면, Set 객체를 배열로 변환할 수 있습니다.
파라미터로는, 변환될 배열 객체를 넘겨주면 되는데,
이때 배열의 크기를 0으로 지정하면 자동으로 배열의 크기가 지정됩니다.
*/