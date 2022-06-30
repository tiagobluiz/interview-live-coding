package com.mercedes.interview.spring;

import org.springframework.http.ResponseEntity;

import java.util.List;

// Q: Which annotation should be used in Spring to identify a Controller?
public class EmployeeController {

    // Q: How would you import the EmployeeService? Which possible ways do you know to import beans?
    EmployeeService employeeService;

    // Q: Which paths would you define for the operations supported by this controller?
    // Q: Which HTTP Verbs would you use for the operations supported by this controller, and how would you say to Spring which one to use?

    // Q: When returning a response to a client which headers should be defined at the controller?
    public ResponseEntity<List<Employee>> getAllEmployees() {
        final var employees = employeeService.getAllEmployees();
        return null;
    }

    /**
     * Returns a single employee identified by its id
     */
    public ResponseEntity<List<Employee>> getEmployee(/*Q: How would you tell spring to get the value for this property?*/long employeeId) {
        final var employee = employeeService.getEmployee(employeeId);
        return null;
    }

    /**
     * Saves the {@link Employee} instance received by parameter in the database
     */
    public ResponseEntity<Employee> createNewEmployee(final Employee employeeToCreate) {
        final var createdEmployee = employeeService.createNewEmployee(employeeToCreate);
        return null;
    }

    /**
     * Update the employee instance identified by the id received by parameter. The updated instance is received by parameter.
     */
    ResponseEntity<Employee> updateEmployeeWithId(final long id,
        /*Q: How would you tell spring to get the value for this object?*/ final Employee updatedEntity) {
        final var updatedEmployee = employeeService.updateEmployeeWithId(id, updatedEntity);
        return null;
    }

    /**
     * Deletes the employee instance identified by the id received by parameter
     */
    // Q: Do you know how we could restrict this operation to a set of users?
    void deleteEmployeeWithId(final long id) {
        employeeService.deleteEmployeeWithId(id);
    }
}
