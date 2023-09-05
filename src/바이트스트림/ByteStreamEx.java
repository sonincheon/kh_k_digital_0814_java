package 바이트스트림;

import java.io.*;

//OutputStream : 바이트 기반 출력 스트림의 최상위 클래스
public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
        //ex1
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);
        // ex2
//        OutputStream os = new FileOutputStream("test2.bin");
//        byte[] array = {10,20,30};
//        os.write(array);

        //ex3
//        OutputStream os = new FileOutputStream("test3.bin");
//        byte [] array = { 10,20,30,40,50};
//        os.write(array,1,3); //배열의 1번 인덱스 부터 3개 출력

//        os.flush(); // 버퍼 비우기
//        os.close(); // 자원 반납 후 스트림 닫기

        //Input Ex1
        InputStream is = new FileInputStream("test2.bin");
//        while (true){
//            int data = is.read(); // 1바이트씩
//            if(data == -1 )break; //더이상 읽을 내용이 없으면 -1
//            System.out.println(data);
//        }
        byte[] buffer = new byte[100];
        //Input Ex2
        while (true){
            int readNum = is.read(buffer); // 버퍼를 집어넣어 배열의 길이 만큼 읽기
            if(readNum == -1) break;
            for(int i =0 ; i < readNum; i++){
                System.out.println((buffer[i]));
            }
            is.close();
        }



    }
}
