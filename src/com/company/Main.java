package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DogKennel dog = new DogKennel();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        dog.addArrDog(count);
        System.out.println(dog);
    }
}
