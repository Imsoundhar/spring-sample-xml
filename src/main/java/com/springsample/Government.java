package com.springsample;

import java.util.List;

public class Government {

    private String name;
    private List<School> school;

    public List<School> getSchool() {
        return school;
    }

    public void setSchool(List<School> school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("bean created in government");
    }

    public void destroy() {
        System.out.println("bean destroyed in government");
    }

    @Override
    public String toString() {
        return "name : " + name + ", School : " + school;
    }
}
