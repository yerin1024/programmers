package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 16�� (������)
 * 48. ���� ���ڿ��� ���ܾ�
 */
public class NumberStringAndEnglishWord {
    public int solution(String s) {
        int answer = 0;
        
        System.out.println("before = "+s);
        
        s = s.replace("zero", "0")
		     .replace("one", "1")
		   	 .replace("two", "2")
		   	 .replace("three", "3")
		   	 .replace("four", "4")
		   	 .replace("five", "5")
		   	 .replace("six", "6")
		   	 .replace("seven", "7")
		   	 .replace("eight", "8")
		   	 .replace("nine", "9");
        
        System.out.println("after = "+s);

        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
}
