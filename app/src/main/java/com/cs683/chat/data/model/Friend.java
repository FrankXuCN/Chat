package com.cs683.chat.data.model;

public class Friend {
    private String name;
    private int age;
    private String gender;

    public static Friend[] friends ={new Friend("Alice"), new Friend("Bob")};
    public Friend (String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
