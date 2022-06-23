# Exercise 5
Implement a service and its respective methods. You can find the method signatures below:

/**
 * Get a list with the construction year of all vehicles received by parameter that have the name
 */
List<Integer> getAllVehiclesConstructionYearWithName(final List<Vehicle> vehicles, final String name);

/**
 * Get a list with all the extras from all vehicles (bonus: would it be possible to return only unique extras?)
 * Q6: Do you know any way to speed up this computation? Would it be possible to use it in this scenario?
 */
List<String> getAllExtras(final List<Vehicle> vehicles);

/**
 * Get the first vehicle whose construction year matches with the one received by parameter.
 * Q7: If none is found, how would you deal with such case?
 */
Vehicle getVehicleWithConstructionYear(final List<Vehicle> vehicles, final int requiredConstructionYear);

/**
 * Get the name of any vehicle whose name matches with the one received by parameter.
 * The name should be prefixed with "Car". For example, for vehicle named "A Class", we would return "Car A Class"
 * Q8: What are optionals, why and when are they useful?
 */
String getAnyVehicleWithName(final List<Vehicle> vehicles, final String name);

# Q9: 
The keyword final precedes the declaration of every parameter on the methods above. What advantages do you see in this approach?

# Q10: 
Imagine that you had a bug in the implementation of your service, how would you find this bug, which tools would you use?