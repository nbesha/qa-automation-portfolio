package com.qa.course;

public class FirstTest {

    public static void main(String[] args) {

        System.out.println("My QA Automation journey begins!");

    }

    public int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException(
                    "Cannot divide by zero"
            );
        }

        return a / b;
    }
}