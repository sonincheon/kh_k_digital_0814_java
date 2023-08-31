package 학생성적정렬;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentInfo> {

    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.score<o2.score) return 1;
        else if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        return -1;
    }


}
