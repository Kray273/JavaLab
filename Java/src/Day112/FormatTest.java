package Day112;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {
    public static void main(String[] args) {
        double d = 3.14 * 10;
        System.out.println(d);

        DecimalFormat df = new DecimalFormat("##.###"); //# = 1자리 10진수, 0표시 안함
        String dStr = df.format(d); // .format의 returnType? String
        System.out.println(dStr); // 0인 숫자는 출력 하지 않음.

        DecimalFormat df2 = new DecimalFormat("000.000"); // 0 = 1자리 10진수 0 표시함
        String dStr2 = df2.format(d); // .format의 returnType? String
        System.out.println(dStr2); // 0인 숫자는 출력 하지 않음.

        //DecimalFormat df3 = new DecimalFormat("0##.#0"); // error IllegalArgumentException
        // #과 0을 혼합해서 사용할 수 없다(소수점을 기준!). 의미가 충돌되기 때문.

        double d1 = 1234.5678;
        double d2 = -1234.5678;
        DecimalFormat df4 = new DecimalFormat("###.00+;000.00-");//음수 양수 다르게 보여줌.
        String dStr4 = df4.format(d1);
        System.out.println(dStr4);
        String dStr5 = df4.format(d2);
        System.out.println(dStr5);

        DecimalFormat df5 = new DecimalFormat("00,000,000.00");// ,는 점을 찍음.
        String dStr6 = df5.format(d1);
        System.out.println(dStr6);

        // y-연도 M-월 d-일(월)  D(연도)  H-24시간  m-분  s-초  E-요일
        SimpleDateFormat sdf = new SimpleDateFormat
        ("yyyy년도 MM월 dd일 DDD(1년중 몇번째 일)/ HH시 mm분 ss초 E요일");
        Calendar date = Calendar.getInstance();
        String dataSdf = sdf.format(date.getTime()); //returnType String
        System.out.println(dataSdf);

        //데이터 입력 - 2024 1 2 3 4 5
        //2023년 1월 2일 3시 4분 5초 Calendar로 생성
        //1년중 몇주째인지 출력
        //해당월의 몇주째인지 출력
        // 요일 출력
        String[] days = {"2024", "1", "2", "3","4","5"};
        int[] argsInt = new int[days.length];
        for(int i=0; i< days.length; i++){
            argsInt[i] = Integer.parseInt(days[i]);
        }
        Calendar date2 = Calendar.getInstance();
        date2.set(argsInt[0],argsInt[1]-1, argsInt[2],argsInt[3],argsInt[4],argsInt[5]);
        //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
        //System.out.println(sdf2);
        SimpleDateFormat sdf2 = new SimpleDateFormat
                ("yyyy년도의 w번째 주이고 MM월의 W번째 주, E요일입니다.");
        System.out.println(sdf2.format(date.getTime()));
    }
}
