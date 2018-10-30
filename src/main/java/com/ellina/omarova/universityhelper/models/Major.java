package com.ellina.omarova.universityhelper.models;

import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<University> universities;
    private ArrayList<Qualification> qualifications;

    public Major(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<University> getUniversities() {
        return universities;
    }

    public void setUniversities(ArrayList<University> universities) {
        this.universities = universities;
    }

    public ArrayList<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(ArrayList<Qualification> qualifications) {
        this.qualifications = qualifications;
    }
}
