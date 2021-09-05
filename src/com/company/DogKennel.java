package com.company;

import java.util.Scanner;
import java.util.Vector;

public class DogKennel {
    private Vector dogList = new Vector(0);
    private int dogCount;

    public void addDog(){
        int age;
        String dogName;
        System.out.println("Dog attributes (age, name): ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        dogName = scanner.nextLine();
        Dog dog = new Dog(age, dogName);
        this.dogCount = dogCount + 1;

        dogList.addElement(dog);
    }

    public void addArrDog(int count){
        for(int i = 0; i < count; i++){
            addDog();
        }
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogList=" + dogList +
                ", dogCount=" + dogCount +
                '}';
    }
}
