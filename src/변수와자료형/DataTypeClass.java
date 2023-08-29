package 변수와자료형;
// 변수란 ? 값을 저장 할 수 있는 메모리 공간에 이름을 붙이는 것 .

import java.sql.SQLOutput;

public class DataTypeClass {
    public static void main(String[] args) {
        int age; // 정수형 변수 선언, 4바이트(32bit) 공간 확보하고 초기값은 아직없음, 정수값(소수점 이하가 없는 값)을 저장하는 목적,
        double value; // 실수값을 저장하기 위한 변수 선언
        char gender = 'M'; // 선언과 동시에 초기화, gender라는 변수에 문자 M을 대입한다는 의미


//        int 1st; // 숫자가 앞에오면 안됨
//        int class; // class는 예약어
//        int a@;   // 특수문자는 안됨
//        int taxRate; // camel 표기법 : 자바는 카멜 표기법 사용합니다 [변수일시]


        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해서 사용하는 자료형
        boolean isTrue; // true,false의 예약어만 사용 가능

        //정수형 변수 선언 : 소수점 이하가 없고 양수와 음수만 존재
        byte bNum; // 1Byte 크기의 변수 선언 1Byte == 8bit( -128 ~ + 127)
        short sNum; // 2Byte 크기의 변수 선언 2Byte == 16bit
        int iNum; // 4Byte  (기본)
        long lNum;// 8Byte  (숫자 크면)

        //실수형 변수 선언 : 근사치 계산 가능, 정확한값으로 잘라내야함
        float fNum; //4Byte
        double dNum; //8Byte   (기본)

        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음 (콤마로 구분)
        double num3 = 3.14; // 선언과 동시에 값을 초기화함
        double num4 = 1.23, mum5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute + "분");







    }

}

