package com.mercedes.interview.architecture;

import java.util.List;

/**
 * Entity that represents a Car.
 * <p>
 * {@link Car#name} represents the name of the car, e.g.: A Class
 * {@link Car#constructionYear} the year when the car was manufactured
 * {@link Car#extras} is a list with the names of the extras included in the car, e.g.: ["premium package", "parking assistant"]
 */
public class Car {

    // Q1: Which access modifiers do you know? Which one is used by default?
    public String name;
    public int constructionYear; // Q2: What are primitive and reference type? What are the main differences between them?
    public List<String> extras; // Q3: Which data structures do you know?

    public Car(String name, int constructionYear, List<String> extras) {
        this.name = name;
        this.constructionYear = constructionYear;
        this.extras = extras;
    }

    // Exercise 1: Analyze the three classes and formulate an opinion in regards its architecture.
    // If you think that something should be different, implement it.
}
