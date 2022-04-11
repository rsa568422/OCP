package ocp.refactored;

import java.util.LinkedList;
import java.util.List;

public class EmployeeMemoryPersistence implements EmployeePersistence {

    private final List<Employee> employees;

    public EmployeeMemoryPersistence() {
        this.employees = new LinkedList<>();
    }

    @Override
    public List<Employee> findAll() {
        return this.employees;
    }

    @Override
    public void save(Employee employee) {
        this.employees.add(employee);
    }
}
