package com.ellina.omarova.universityhelper.models;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Major> majors;

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Major> getMajors() {
        return majors;
    }

    public void setMajors(ArrayList<Major> majors) {
        this.majors = majors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
