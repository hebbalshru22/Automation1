package com.qapitol.Model;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private int bid;
    private String subject;
    private int bcount;
    private List<Students> stus;




    public void addStudent(Students student) {
        if (this.stus == null) {
            this.stus = new ArrayList<>();  // Initialize it if it is null
        }
        this.stus.add(student);
    }

    public List<Students> getStus() {
        return stus;
    }

    public void setStus(List<Students> stus) {
        this.stus = stus;
    }

    public int getBid() {
        return bid;
    }

    public String getSubject() {
        return subject;
    }

    public int getBcount() {
        return bcount;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBcount(int bcount) {
        this.bcount = bcount;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bid=" + bid +
                ", subject='" + subject + '\'' +
                ", bcount=" + bcount +
                '}';
    }
}
