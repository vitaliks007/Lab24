package com.company;

public class Dog {
    private int age;
    private String dogName;

    public Dog(int age, String dogName) {
        this.age = age;
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int agingDogToHuman(){
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
