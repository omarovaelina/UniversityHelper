package com.ellina.omarova.universityhelper.models;

public class Qualification {
    private int id;
    private int sat, ielts;
    private float gpa;

    public Qualification(int id) {
        this.id = id;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getIelts() {
        return ielts;
    }

    public void setIelts(int ielts) {
        this.ielts = ielts;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
