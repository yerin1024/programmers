package com.lyr.programmers.level1;

/*
 * 2022³â 2¿ù 14ÀÏ (¿ù¿äÀÏ)
 * 36. ³»Àû(=½ºÄ®¶ó °ö, ½×À» Àû->°ö)
 */
public class ScalarProduct {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++) {
        	answer += a[i]*b[i];
        }
        
        System.out.println(answer);
        return answer;
    }
}
