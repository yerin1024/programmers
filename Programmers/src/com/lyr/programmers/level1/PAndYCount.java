package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 23. ���ڿ� �� p�� y�� ����
 */
public class PAndYCount {
	public boolean solution(String s) {
        boolean answer = true;
        System.out.println(s);
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");
        
        //���� Ǭ ���
//        int pCnt = 0;
//        int yCnt = 0;
        //�ٸ���� Ǯ�� ����
        int totalCnt = 0;
        
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 'p') {
//        		pCnt++;
        		totalCnt++;
        	}else if(arr[i] == 'y') {
//        		yCnt++;
        		totalCnt--;
        	}
        }

//        if(pCnt != yCnt) {
//        	answer = false;
//        }
//        System.out.println("pCnt = "+pCnt+" && yCnt = "+yCnt);
       
        if(totalCnt != 0) {
        	answer = false;
        }
        
        System.out.println(answer);
        
        return answer;
    }
}
