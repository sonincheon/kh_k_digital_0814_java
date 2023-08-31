package 학생성적정렬;

import java.util.TreeSet;

// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람순으로 정렬 성적이 같으면 이름순 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> set = new TreeSet<>(new StudentComparator());
        set.add(new StudentInfo("손인천",100));
        set.add(new StudentInfo("김현빈",90));
        set.add(new StudentInfo("이재성",60));
        set.add(new StudentInfo("이재원",80));
        set.add(new StudentInfo("정벼리",80));

        for(StudentInfo a : set){
            System.out.println("이름 : " +a.name);
            System.out.println("점수 : " +a.score);
            System.out.println("-".repeat(25));
        }
    }
}
