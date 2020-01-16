package com.renitalobo.expense.model;


import javax.persistence.*;

@Entity
public class Category {

    public Category(){

    }

    @Id
    private Long uuid;

    @Column
    private String name;


    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
