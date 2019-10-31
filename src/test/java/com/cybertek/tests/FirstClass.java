package com.cybertek.tests;


import com.github.javafaker.Faker;
import org.w3c.dom.ls.LSOutput;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().country());



    }
}
