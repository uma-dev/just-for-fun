package com.example;

/**
 * Classic problems that I have found in books and exercises
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Factorial.getFactorialRec(6));
        HanoiTower myTower = new HanoiTower(6);
        myTower.move(0, 2);

    }
}
