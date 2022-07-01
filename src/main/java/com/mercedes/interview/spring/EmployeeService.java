package com.mercedes.interview.spring;

import java.util.Collections;
import java.util.List;

// Q: What are interfaces and abstract classes? What are the differences between them?
// Q: Would it make sense to have an interface or abstract class for this service?
// Q: In spring, how can we mark this service as a Bean (and what is a bean?)?
// Q: Which of these methods would need Transactional annotation and why?
// Q: Imagine that these calls to the database are really slow, how would you debug it and how would you tackle this performance issues?
public class EmployeeService {

    // Q: If we want to autowire a class that does not have any spring context, how can we do it?

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
