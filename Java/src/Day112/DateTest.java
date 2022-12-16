package Day112;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now); //toString() 자동호출
        System.out.println(now.getYear()); //deprecated 매서드
        //소스 구현상 문제, 다른 매서드와 여러이유로 충돌
        //대체 메소드 사용 권고

        //Calendar
        //Calendar cal = new Calendar(); //객체를 생성하려고하면 error instance생성자를 만들수 없다.
        //지구상에는 다양한 지역에 맞는 시간이 있어서 하위 클래스를 제공.
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.printf("현재 년도 = %d, 월 = %d, 일 = %d, 시 = %d, 분 = %d, 초 = %d !\n",year,month,day,hour,minute,second);

    }
}
