package com.lyr.programmers.level1;

import java.util.Calendar;
import java.util.Locale;

/*
 * 2022�� 2�� 14�� (������)
 * 32. 2016��
 */
public class GettingWeekend {
	public String solution(int a, int b) {
        String answer = "";
        //���� Ǭ ���
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekend = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; //1�� 1�� �ݿ��� ����
        int days = 0;
        //1,3,5,7,8,10,12 31��
        //2,4,6,9,11 30��
        
        //5�� 24�� -> TUE
        //1�� 2�� -> SAT
        if(a>1) {
            for(int i=0; i<a-1; i++) {
            	days += day[i];
            	System.out.println(day[i] +" && " +days);
            }
        }
        days+=(b-1);

        answer = weekend[days%7];
        
    	System.out.println(days+"&&"+days%7);
        System.out.println(answer);
        
        //�ٸ� ����� Ǯ�� ����
//        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
//        					.setDate(2016, a-1, b).build();
//        answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
//        System.out.println(answer);
        
        return answer;
    }
}
