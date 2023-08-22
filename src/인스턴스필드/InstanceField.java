package 인스턴스필드;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; // 지역 변수
        FieldTset fieldTset1 = new FieldTset();
        fieldTset1.instanceVal = 200; //각각의 객체 마다 값을 다르게 설정 할수 있음
        FieldTset fieldTset2 = new FieldTset();
        fieldTset2.instanceVal = 300;

        FieldTset.ClassVal = 1000;

    }
}
