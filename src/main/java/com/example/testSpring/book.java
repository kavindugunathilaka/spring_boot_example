package com.example.testSpring;
import java.util.Date;



public class book {

    private Integer bookid;
    private String bookname;
    private Date publishdate;

    public book(int bookid, String bookname, Date publishdate) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.publishdate = publishdate;
    }

    public Integer getBookid() {
        return  bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", publishdate=" + publishdate +
                '}';
    }
}
