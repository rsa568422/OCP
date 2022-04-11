package ocp.badexample;

import java.util.LinkedList;
import java.util.List;

public class ProgrammerMemoryPersistence {

    private List<Programmer> programmers;

    public ProgrammerMemoryPersistence() {
        this.programmers = new LinkedList<>();
    }

    public List<Programmer> findAll() {
        return this.programmers;
    }

    public void save(Programmer programmer) {
        this.programmers.add(programmer);
    }
}
