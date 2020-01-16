package com.renitalobo.expense.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class User {

    @Id
    private Long uuid;

    @Column
    private String name;

    @Column
    private String email;


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }



    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
