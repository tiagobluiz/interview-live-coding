package com.mercedes.interview.java;

import java.util.List;

/**
 * Entity that represents a generic Vehicle.
 * <p>
 * {@link Vehicle#name} represents the name of the vehicle, e.g.: A Class
 * {@link Vehicle#constructionYear} the year when the vehicle was manufactured
 * {@link Vehicle#extras} is a list with all the extras a car has, e.g.: ["premium package", "parking assistant"]
 */
public class Vehicle {

    public String name;
    public int constructionYear;
    public List<String> extras;

    public Vehicle(String name, int constructionYear, List<String> extras) {
        this.name = name;
        this.constructionYear = constructionYear;
        this.extras = extras;
    }

    // Exercise: Implement a singleton for this class.
    // Q: What is lazy and eager initialization? How would you categorize your implementation?
    // Q: Is a singleton, by default, thread-safe? If your answer is no, do you know any way to make it safe?












    // Exercise 5: Make this class immutable.

    // Q: Imagine that you had a bug in the implementation of your service, how would you find this bug, which tools would you use?
}
