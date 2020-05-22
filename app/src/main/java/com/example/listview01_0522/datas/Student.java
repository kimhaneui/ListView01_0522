package com.example.listview01_0522.datas;

public class Student {
    private String name;
    private String address;
    //    alt + insert 자동 완성 기능


    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
