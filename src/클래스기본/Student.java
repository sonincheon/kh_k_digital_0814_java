package 클래스기본;

public class Student {
    //private 외부에서 해당 필드에 대한 접근을 막음
    private int id;             // 학번, 필드라고 부름 (인스턴스 필드)
    private String name;        // 이름
    private int grade;          // 학년
    private String addr;        // 주소

    //메소드
//    접근제한자 반환타입 메소드이름(매개변수목록){
//       구현부
//    }

    public void showInfo() {
        System.out.println(name + ", " + addr);
    }

    // 세터 : 접근막은것을 사용할수있게 해줌
    public String setName(String name) {
        this.name = name;
        return "참입니다.";
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

