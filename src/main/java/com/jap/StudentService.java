package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData() {
        //create six student object by calling Student class parameterized constructor
        Student student1 = new Student("Hema", 101, 567);
        Student student2 = new Student("Ajay", 1084, 555);
        Student student3 = new Student("Mom", 114, 456);
        Student student4 = new Student("Chaitu", 132, 678);
        Student student5 = new Student("Revathi", 116, 878);
        Student student6 = new Student("Yasree", 117, 968);

        //create HashSet object and add all the students object inside it
        Set<Student> Student = new HashSet<>();
        Student.add(student1);
        Student.add(student2);
        Student.add(student3);
        Student.add(student4);
        Student.add(student5);
        Student.add(student6);

        //return the HashSet object
        return Student;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        //Create a TreeSet object
        Set<String> Student = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        System.out.println("Names list:  " + Student.iterator());
        //return the TreeSet object;
        return Student;
    }

    public static Map<String, Integer> calculateAverage(Set<Student> studentSet) {
        //create a HashMap object of type <String,Integer>
        Map<String, Integer> map = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            Student obj = iterator.next();
            map.put(obj.getName(), obj.getTotalMarks());
        }
        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        return map;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(studentName);
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}