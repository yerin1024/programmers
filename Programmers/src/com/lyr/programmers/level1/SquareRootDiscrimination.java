package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 11�� (�ݿ���)
 * 11. ���� ������ �Ǻ� 
 */
public class SquareRootDiscrimination {//������ Square Root, �Ǻ� Discrimination
	public long solution(long n) {
		//n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� ����
		double num = Math.sqrt(n);
		System.out.println(num);
		
		if(num%1 > 0) {
	        System.out.println(-1);
			return -1;
		}
		
        long answer = (long)((num+1)*(num+1));
        System.out.println(answer);
        return answer;
    }
}
