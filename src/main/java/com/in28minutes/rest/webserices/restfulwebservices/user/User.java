package com.in28minutes.rest.webserices.restfulwebservices.user;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

    private Integer Id;

    @Size(min=2, message="Name should have at least 2 characters")
    private String name;

    @Past
    private Date birthDate;

    protected User() {
    }

    public User(Integer id, String name, Date birthDate) {
        Id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
