package com.mercedes.interview.java;

import java.util.Collections;
import java.util.List;

public class VehicleService {

    /**
     * Get a list with the construction year of all vehicles received by parameter that have the name
     */
    List<Integer> getAllVehiclesConstructionYearWithName(final List<Vehicle> vehicles, final String name) {
        return Collections.emptyList();
    }

    /**
     * Get a list with all the extras from all vehicles (bonus: would it be possible to return only unique extras?)
     */
    List<String> getAllExtras(final List<Vehicle> vehicles) {
        return Collections.emptyList();
    }

    /**
     * Get any vehicle whose construction year matches with the one received by parameter.
     * Q: Do you know any way to speed up this computation? Would it be possible to use it in this scenario?
     * Q: If none is found, how would you deal with such case?
     */
    Vehicle getVehicleWithConstructionYear(final List<Vehicle> vehicles, final int requiredConstructionYear) {
        return null;
    }
}
