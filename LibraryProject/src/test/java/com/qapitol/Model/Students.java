package com.qapitol.Model;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private int id;
    private String name;
    private int age;
    private String address;
    private List<Books> booklist;


   /* public Students(int id,String name,int age,String address)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.booklist=new ArrayList<>();
    }*/



    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", booklist=" + booklist +
                '}';
    }
}
