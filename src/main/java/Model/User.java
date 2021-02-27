package Model;

import java.io.Serializable;


public class User implements Serializable {
    private String id;
    private String name;
    private Long salary;
    private String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public User(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User(String id, String name, Long salary, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
