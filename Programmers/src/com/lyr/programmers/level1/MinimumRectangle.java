package com.lyr.programmers.level1;

/*
 * 2022�� 2�� 14�� (������)
 * 31. �ּ����簢��
 */
public class MinimumRectangle {
	public int solution(int[][] sizes) {
        //sizes = [w, h], w = ����, h = ����
		//�ٸ� ����� Ǯ�� ����1
		int answer = 0;
//		
//		//���ΰ� ���κ��� ��ū���� ���� ����
//		for(int i=0; i<sizes.length; i++) {
//			System.out.println(sizes[i][0]+" && "+sizes[i][1]);
//			
//			if(sizes[i][0] < sizes[i][1]) {
//				int tmp = sizes[i][0];
//				sizes[i][0] = sizes[i][1];
//				sizes[i][1] = tmp;
//			}
//			
//			System.out.println(sizes[i][0]+" && "+sizes[i][1]);
//		}
//		
//		
//		//�����߿��� �ִ�, �����߿��� �ִ�
//		int maxW = sizes[0][0];
//		int maxH = sizes[0][1];
//		for(int i=1; i<sizes.length; i++) {
//			if(maxW < sizes[i][0]) {
//				maxW = sizes[i][0];
//			}
//			if(maxH < sizes[i][1]) {
//				maxH = sizes[i][1];
//			}
//		}
//
//		answer = maxW*maxH;
//		System.out.println(maxW+" * "+maxH+" = "+answer);
		
		//�ٸ� ����� Ǯ�� ����2
		int maxW = 0; 
		int maxH = 0;
		for(int[] size : sizes) {
			int max = Math.max(size[0], size[1]); //���μ����� ū ���� ���ο� ����
			int min = Math.min(size[0], size[1]); //���μ����� ���� ���� ���ο� ����
			
			if(maxW < max) {
				maxW = max;
			}
			if(maxH < min) {
				maxH = min;
			}
		}
		
		answer = maxW*maxH;
		System.out.println(maxW+" && "+maxH+" = "+answer);
		
        return answer;
    }
}
