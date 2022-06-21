package com.mercedes.interview.architecture;

import java.util.List;

/**
 * Entity that represents a Motorcycle.
 * <p>
 * {@link Motorcycle#name} represents the name of the motorcycle, e.g.: Smart
 * {@link Motorcycle#constructionYear} the year when the motorcycle was manufactured
 * {@link Motorcycle#extras} is a list with the names of the extras included in the motorcycle, e.g.: ["premium package"]
 */
public class Motorcycle {

    public String name;
    public int constructionYear;
    public List<String> extras;

    public Motorcycle(String name, List<String> extras) {
        this.name = name;
        this.extras = extras;
    }

    // Exercise 1: Analyze the three classes and formulate an opinion in regards its architecture.
    // If you think that something should be different, implement it.
}
