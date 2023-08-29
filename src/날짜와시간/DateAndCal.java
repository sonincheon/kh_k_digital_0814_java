package 날짜와시간;
// Date() : 운영체제로 부터 날짜와 시간정보를 가져와 원하는 포맷형태로 출력, 객체 생성해야 함 .
// 자바의 java.util 패키지에 포함되어 있어 import를 해야함
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        //yyyy : 년도를 4자리로 표시
        //yy : 년도를 2자리로 표시
        //MM : 월을 표시(대문자임에 유의 , 월이 두자리로 표시됨)
        //HH : 24시간제
        //hh : 12시간제
        //mm : 분을 출력
        SimpleDateFormat f1,f2,f3,f4,f5,f6,f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH : mm : ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd HH : mm : ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번재주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        Calendar now1 = Calendar.getInstance();
        System.out.println(now1.get(Calendar.YEAR));
        System.out.println(now1.get(Calendar.MONTH)+1); //인덱스임을 유의해야함
        System.out.println(now1.get(Calendar.DAY_OF_MONTH)); // 주에서 몇번째 날인지
        System.out.println(now1.get(Calendar.DAY_OF_WEEK)); //월에서 몇번쨰 주인지
        System.out.println(now1.get(Calendar.AM_PM)); //AM : 0 / PM : 1
        System.out.println(now1.get(Calendar.HOUR));
        System.out.println(now1.get(Calendar.MINUTE));
        System.out.println(now1.get(Calendar.SECOND));


        System.out.println(now1.get(Calendar.YEAR)+"년"+ (now1.get(Calendar.MONTH)+1)+"월"+ now1.get(Calendar.DAY_OF_MONTH)+"일 "+now1.get(Calendar.HOUR)+"시"+ now1.get(Calendar.MINUTE)+"분"+now1.get(Calendar.SECOND)+"초");
        // Calendar 클래스로 yyyy년 MM월 dd일 HH시mm분ss초 포맷과 동일하게 출력하기




    }
}
