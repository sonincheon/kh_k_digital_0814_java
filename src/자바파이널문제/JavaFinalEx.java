package 자바파이널문제;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaFinalEx {

    public static void main(String[] args)   {
        TreeSet<Student> list = new TreeSet<>(new Array());
        FileInputStream fis =null;
       try {
            fis = new FileInputStream("d:/tmp/가이드.txt");
       }catch (FileNotFoundException e){
           System.out.println("파일을 읽을수 없습니다.");
       }
        Scanner sc = new Scanner(fis);

        while (sc.hasNext()){
            String[] line = sc.nextLine().split(" ");
            list.add(new Student(line[0], line[1], line[2], line[3],
                        Integer.parseInt(line[1])+Integer.parseInt(line[2])+Integer.parseInt(line[3])));
        }
        for(Student e: list) {
            System.out.println(e.getName()+" : " +e.getSum());
        }
    }
}

class Array implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.sum<o2.sum) return 1;
        else if (o1.sum == o2.sum) {
            return o1.name.compareTo(o2.name);
            }
        return -1;
    }
}


class Student{
    String name;
    String a,b,c;
    int sum ;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Student(String name, String a, String b, String c,int sum) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.sum =sum;
    }
}
