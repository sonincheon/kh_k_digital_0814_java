package 단어정렬하기;


public class Com implements Comparable<Com> {
    String en;

    public Com(String en) {
        this.en = en;
    }

    @Override
    public int compareTo(Com o) {
        if(this.en.length()>o.en.length())return 1;
        if(this.en.length()==o.en.length()){
            return this.en.compareTo(o.en);
        }else if(this.en == o.en) return 0;
        else return -1;
    }
}



