package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student1 = new Student("Hema",101,567);
        Student student2 = new Student("Ajay",1084,555);
        Student student3 = new Student("Mom",114,456);
        Student student4 = new Student("Chaitu",132,678);
        Student student5 = new Student("Revathi",116,878);
        Student student6 = new Student("Yasree",117,968);

        //create HashSet object and add all the students object inside it
        Set<Student>Student = new HashSet<>();
        //return the HashSet object



        return null;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object

        //Use Iterator object of type <Student> to iterate through the studentSet

        //get all the name and add it inside the TreeSet object

      //return the TreeSet object;
        return null;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>

        //Use Iterator object of type <Student>to iterate through the studentSet

        //retrieve the Student object from the iterator

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

           return null;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
