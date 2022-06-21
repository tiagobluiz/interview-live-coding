package com.mercedes.interview.architecture;

import java.util.List;

/**
 * Entity that represents a Truck.
 * <p>
 * {@link Truck#name} represents the name of the truck, e.g.: Citaro
 * {@link Truck#constructionYear} the year when the truck was manufactured
 * {@link Truck#extras} is a list with the names of the extras included in the truck, e.g.: ["premium package", "support for reduced mobility"]
 * {@link Truck#isTrailerAttached}  {@code true}, then the truck has a trailer attached, {@code false} otherwise.
 */
public class Truck {

    public String name;
    public int constructionYear;
    public List<String> extras;
    public boolean isTrailerAttached;

    public Truck(String name, List<String> extras, boolean isTrailerAttached) {
        this.name = name;
        this.extras = extras;
        this.isTrailerAttached = isTrailerAttached;
    }

    // Exercise 1: Analyze the three classes and formulate an opinion in regards its architecture.
    // If you think that something should be different, implement it.
}
