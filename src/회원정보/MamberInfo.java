package 회원정보;
// 이름 : 문자열
// 나이 : 정수, 나이는 1~199를 정상 입력으로 간주하고 이외의 값이 오면 재 입력 요구
// 성별 : 문자 M F로임력 출력은 남성과 여성으로 출력
//직업 : 정수로 입력 (1. 학생 2. 회사원 3. 주부 4. 무직) 1~4이외 값이오면 재 입력 요구
//결과 한번에 출력

import java.util.Scanner;

public class MamberInfo {
    String name; // 인스턴스 필드
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName(){
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
    }
    public void setage() {
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age>0 && age<200)return;
            System.out.print("나이를 잘못 입력 하셨습니다.");
        }
    }//void : 결과를 되돌려줄께없으면 보이드, return 메소드 탈출
    public void setgender() {
        while (true) {
            System.out.print("성별을 입력하시오 : ");
            gender = sc.next().charAt(0);
            switch(gender){
                case'M' :
                case'F' :
                case'm' :
                case'f' :
//                    return; : 이거쓰면됨
                    break;
                default:
                    System.out.println("성별을 다시입력하시오.");continue;
            }
            break;
        }
    }
    public void setjobs(){
        while(true){
            System.out.print("직업을 입력하시오 : ");
            jobs = sc.nextInt();
            if(jobs >0 &&jobs <5) break;
            System.out.print("직업을 잘못 입력 하셨습니다.");
        }

    }
    public int getGenderType(){
        if(gender =='M'||gender =='m') return 1;
        else return 2;

    }
    public void getInfor(){
        String[] genderStr ={"","남성","여성"};
        String[] jobsStr={"","학생","회사원","주부","무직"};
        System.out.println("=".repeat(5) + "회원정보"+ "=".repeat(5));
        System.out.println("이름 : " +name);
        System.out.println("나이 : " +age);
        System.out.println("성별 : " +genderStr[getGenderType()]);
        System.out.println("직업 : " +jobsStr[jobs]);


    }

}
