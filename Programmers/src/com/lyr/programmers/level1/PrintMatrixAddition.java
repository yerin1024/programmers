package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 5�� (�����)
 * 4. ����� ����
 */
public class PrintMatrixAddition {
	public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];
		
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println(arr1[i][j]+" + "+arr2[i][j]+" = "+(arr1[i][j]+arr2[i][j]));
				
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
        return answer;
    }
}
