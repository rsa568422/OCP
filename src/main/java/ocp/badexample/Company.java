package ocp.badexample;

import java.util.List;

public class Company {

    private ProgrammerMemoryPersistence persistence;

    public Company() {
        this.persistence = new ProgrammerMemoryPersistence();
    }

    public List<Programmer> getProgrammers() {
        return this.persistence.findAll();
    }

    public void addProgrammer(String fullName, Integer salary) {
        this.persistence.save(new Programmer(fullName, salary));
    }

}
