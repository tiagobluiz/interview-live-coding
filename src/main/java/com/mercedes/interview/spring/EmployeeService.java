package com.mercedes.interview.spring;

import java.util.Collections;
import java.util.List;

// Q11: What are interfaces and abstract classes? What are the differences between them?
// Q12: Would it make sense to have an interface or abstract class for this service?
// Q13: In spring, how can we mark this service as a Bean (and what is a bean?)?
public class EmployeeService {

    /**
     * Returns the instance that is identified by the id received by parameter
     */
    List<Employee> getAllEmployees() {
        return Collections.emptyList();
    }

    /**
     * Returns the instance that is identified by the id received by parameter
     */
    Employee getEmployee(final long id) {
        return null;
    }

    /**
     * Saves the {@link Employee} instance received by parameter in the database
     */
    Employee createNewEmployee(final Employee employeeToCreate) {
        return null;
    }

    /**
     * Update the employee instance identified by the id received by parameter. The updated instance is received by parameter.
     */
    Employee updateEmployeeWithId(final long id, final Employee updatedEntity) {
        return null;
    }

    /**
     * Deletes the employee instance identified by the id received by parameter
     */
    void deleteEmployeeWithId(final long id) {

    }
}
