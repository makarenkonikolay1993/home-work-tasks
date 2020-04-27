package com.hillel.lecture_14;

/**
 * Created by alpa on 12/9/19
 */
public class Friend {

    private Integer id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return
                "{\"id\":" + id +
                ",\"firstName\":" + "\"" + firstName + "\"" +
                ",\"lastName\":\"" + lastName + "\"" +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
