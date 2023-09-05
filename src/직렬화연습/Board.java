package 직렬화연습;
import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
    private int bno;
    private String title;
    private String contents;
    private String writer;
    private Date date;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Board(int bno, String title, String contents, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.date = date;
    }
}
