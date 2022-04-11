package ocp.refactored;

import java.util.List;

public class Company {

    private final EmployeePersistence persistence;

    public Company() {
        this.persistence = new EmployeeMemoryPersistence();
    }

    public List<Employee> getEmployees() {
        return this.persistence.findAll();
    }

    public void addEmployee(Employee employee) {
        this.persistence.save(employee);
    }

}
