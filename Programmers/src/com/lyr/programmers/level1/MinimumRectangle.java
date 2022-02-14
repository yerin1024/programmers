package com.lyr.programmers.level1;

/*
 * 2022년 2월 14일 (월요일)
 * 31. 최소직사각형
 */
public class MinimumRectangle {
	public int solution(int[][] sizes) {
        //sizes = [w, h], w = 가로, h = 세로
		//다른 사람의 풀이 참고1
		int answer = 0;
//		
//		//가로가 세로보다 더큰값이 오게 정렬
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
//		//가로중에서 최대, 세로중에서 최대
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
		
		//다른 사람의 풀이 참고2
		int maxW = 0; 
		int maxH = 0;
		for(int[] size : sizes) {
			int max = Math.max(size[0], size[1]); //가로세로중 큰 값을 가로에 놨음
			int min = Math.min(size[0], size[1]); //가로세로중 작은 값을 세로에 놨음
			
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
