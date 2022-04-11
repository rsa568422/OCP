package ocp.refactored;

import lombok.Getter;

@Getter
public class Manager extends Employee {

    private Integer bonus;

    public Manager(String fullName, Integer salary, Integer bonus) {
        super(fullName, salary);
        this.bonus = bonus;
    }

}
