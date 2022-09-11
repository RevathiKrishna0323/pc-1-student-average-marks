package com.jap;

import java.util.Objects;

public class Student {

    private String name;
    private int rollNo;
    private int totalMarks;

    //create getter and setter for all the above attributes

    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getTotalMarks() {
        return totalMarks;
    }


    //complete the parameterized constructor

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    // override a to string() method

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo=" + rollNo + ", totalMarks=" + totalMarks + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && totalMarks == student.totalMarks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, totalMarks);
    }
}
