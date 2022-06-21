package com.mercedes.interview.java;

import java.util.List;

/**
 * Entity that represents a generic Vehicle.
 * <p>
 * {@link MyClass#name} represents the name of the vehicle, e.g.: A Class
 * {@link MyClass#constructionYear} the year when the vehicle was manufactured
 * {@link MyClass#extras} is a list with all the extras a car has, e.g.: ["premium package", "parking assistant"]
 */
public class MyClass {

    public String name;
    public int constructionYear;
    public List<String> extras;

    public MyClass(String name, List<String> extras) {
        this.name = name;
        this.extras = extras;
    }

    // Q4: Which design patterns do you know?

    // Exercise 3: Implement a singleton for this class.
    // Q5.1: What is lazy and eager initialization? How would you categorize your implementation?
    // Q5.2: Is a singleton, by default, thread-safe? If your answer is no, do you know any way to make it safe?

    // Exercise 4: Make this class immutable.
}
