package com.lyr.programmers.level1;

import java.util.Arrays;

/*
 * 2022�� 2�� 13�� (�Ͽ���)
 * 19. �Ҽ� ã��
 */
public class FindingPrimeNumber { //Prime Number �Ҽ�
	public int solution(int n) {
        int answer = 0;
        
        //���� Ǭ ��� -> ȿ���� ��������
//        for(int i=1; i<=n; i++) {
//        	int divisorCnt = 0;
//        	for(int j=1; j<=Math.sqrt(n); j++) {
//        		if(i%j == 0) {
//        			divisorCnt++;
//        		}
//        	}
//
//    		if(divisorCnt == 2) {
//    			answer++;
//    		}
//        }
//        
//        System.out.println(answer);
        
        //�����佺�׳׽��� ü �˰���
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true); //true�� �Ҽ���
        arr[0] = arr[1] = false;
        int notPrimeNumberCnt = 1; //1�� ������ �Ҽ��� �ƴϴϱ� �Ѱ� �߰��ϰ� ����
        for(int i=2; i<arr.length; i++) { 
        	for(int j=2; j*i<=n; j++) {
        		System.out.println("i = "+i+" && j = "+j);
        		if(arr[i*j] == true) {
            		arr[i*j] = false;
            		notPrimeNumberCnt++;
        		}
        	}
        }
        System.out.println("n = "+n+" && notPrimeNumberCnt = "+notPrimeNumberCnt);
        answer = n-notPrimeNumberCnt;
        System.out.println(answer);
        
        return answer;
    }
}
