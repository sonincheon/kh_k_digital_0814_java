package 연습문제8월17일;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 :");
        String name = sc.next();
        System.out.print("제목 :");
        String title = sc.next();
        System.out.print("날짜(예 :19990101) :");
        String date =sc.next();
        String month =date.substring(4,6);
        String year = date.substring(2,4);
        String day = date.substring(6,8);
        System.out.print("시간 :");
        String time =sc.next();

        System.out.println(name + "님");
        //String greeting="";
        switch(month){
//          case "00" : greeting = "한파의 연속인 00입니다." ; break;

            case "12":
                System.out.println("한파의 연속인 12월입니다.");
                break;
            case "01":
                System.out.println("한파의 연속인 1월입니다.");
                break;
            case "02":
                System.out.println("한파의 연속인 2월입니다.");
                break;
            case "03":
                System.out.println("봄의 기운이 느껴지는 3월입니다.");
                break;
            case "04":
                System.out.println("새싹이 피어나는 4월입니다.");
                break;
            case "05":
                System.out.println("계절의 여왕 5월 입니다.");
                break;
            case "06":
                System.out.println("6월.");
                break;
            case "07":
                System.out.println("7월.");
                break;
            case "08":
                System.out.println("8월.");
                break;
            case "09":
                System.out.println("9월.");
                break;
            case "10":
                System.out.println("10월.");
                break;
            case "11":
                System.out.println("11월.");
                break;
            default:
                System.out.println("알수없는 월입니다.");
                break;
        }
        System.out.println("아래와 일정으로 "+title+"를 진행하고자 하오니 오셔서자리를 빛내 주시기 바랍니다.\n");
        System.out.println("=".repeat(5) + "행사안내=====");
        System.out.println("행사 안내 :" + title);
        System.out.println("일시 : " + year + "년  "+month+"월  "+day+"일");
        System.out.println(time+"시");

    }
}
